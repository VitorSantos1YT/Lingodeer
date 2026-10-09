package com.alibaba.sdk.android.oss.network;

import android.os.ParcelFileDescriptor;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.common.HttpMethod;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.CRC64;
import com.alibaba.sdk.android.oss.common.utils.DateUtil;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.internal.OSSRetryHandler;
import com.alibaba.sdk.android.oss.internal.OSSRetryType;
import com.alibaba.sdk.android.oss.internal.RequestMessage;
import com.alibaba.sdk.android.oss.internal.ResponseMessage;
import com.alibaba.sdk.android.oss.internal.ResponseParser;
import com.alibaba.sdk.android.oss.internal.ResponseParsers;
import com.alibaba.sdk.android.oss.model.GetObjectRequest;
import com.alibaba.sdk.android.oss.model.ListBucketsRequest;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.alibaba.sdk.android.oss.model.OSSResult;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.zip.CheckedInputStream;
import kotlin.jvm.internal.m;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class OSSRequestTask<T extends OSSResult> implements Callable<T> {
    private OkHttpClient client;
    private ExecutionContext context;
    private int currentRetryCount = 0;
    private RequestMessage message;
    private ResponseParser<T> responseParser;
    private OSSRetryHandler retryHandler;

    /* JADX INFO: renamed from: com.alibaba.sdk.android.oss.network.OSSRequestTask$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod = iArr;
            try {
                iArr[HttpMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.GET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.HEAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public OSSRequestTask(RequestMessage requestMessage, ResponseParser responseParser, ExecutionContext executionContext, int i11) {
        this.responseParser = responseParser;
        this.message = requestMessage;
        this.context = executionContext;
        this.client = executionContext.getClient();
        this.retryHandler = new OSSRetryHandler(i11);
    }

    private ResponseMessage buildResponseMessage(RequestMessage requestMessage, Response response) {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setRequest(requestMessage);
        responseMessage.setResponse(response);
        HashMap map = new HashMap();
        Headers headers = response.f45163f;
        ResponseBody responseBody = response.f45164t;
        for (int i11 = 0; i11 < headers.size(); i11++) {
            map.put(headers.d(i11), headers.g(i11));
        }
        responseMessage.setHeaders(map);
        responseMessage.setStatusCode(response.f45161d);
        responseMessage.setContentLength(responseBody.contentLength());
        responseMessage.setContent(responseBody.byteStream());
        return responseMessage;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01af A[Catch: Exception -> 0x001c, TryCatch #4 {Exception -> 0x001c, blocks: (B:3:0x0006, B:5:0x000e, B:8:0x0021, B:10:0x0048, B:12:0x0051, B:14:0x005e, B:15:0x006f, B:17:0x0075, B:18:0x0097, B:72:0x0216, B:29:0x00de, B:30:0x00e7, B:31:0x00ec, B:35:0x00f8, B:37:0x0105, B:65:0x01af, B:67:0x01b7, B:68:0x01c2, B:70:0x01e2, B:71:0x0203, B:40:0x011c, B:42:0x0126, B:45:0x0142, B:46:0x0149, B:47:0x014a, B:49:0x0152, B:52:0x0180, B:58:0x018a, B:59:0x018d, B:60:0x018e, B:62:0x0196, B:63:0x01a4, B:13:0x0058, B:90:0x02dc, B:91:0x02e3), top: B:157:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01b7 A[Catch: Exception -> 0x001c, TryCatch #4 {Exception -> 0x001c, blocks: (B:3:0x0006, B:5:0x000e, B:8:0x0021, B:10:0x0048, B:12:0x0051, B:14:0x005e, B:15:0x006f, B:17:0x0075, B:18:0x0097, B:72:0x0216, B:29:0x00de, B:30:0x00e7, B:31:0x00ec, B:35:0x00f8, B:37:0x0105, B:65:0x01af, B:67:0x01b7, B:68:0x01c2, B:70:0x01e2, B:71:0x0203, B:40:0x011c, B:42:0x0126, B:45:0x0142, B:46:0x0149, B:47:0x014a, B:49:0x0152, B:52:0x0180, B:58:0x018a, B:59:0x018d, B:60:0x018e, B:62:0x0196, B:63:0x01a4, B:13:0x0058, B:90:0x02dc, B:91:0x02e3), top: B:157:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x01e2 A[Catch: Exception -> 0x001c, TryCatch #4 {Exception -> 0x001c, blocks: (B:3:0x0006, B:5:0x000e, B:8:0x0021, B:10:0x0048, B:12:0x0051, B:14:0x005e, B:15:0x006f, B:17:0x0075, B:18:0x0097, B:72:0x0216, B:29:0x00de, B:30:0x00e7, B:31:0x00ec, B:35:0x00f8, B:37:0x0105, B:65:0x01af, B:67:0x01b7, B:68:0x01c2, B:70:0x01e2, B:71:0x0203, B:40:0x011c, B:42:0x0126, B:45:0x0142, B:46:0x0149, B:47:0x014a, B:49:0x0152, B:52:0x0180, B:58:0x018a, B:59:0x018d, B:60:0x018e, B:62:0x0196, B:63:0x01a4, B:13:0x0058, B:90:0x02dc, B:91:0x02e3), top: B:157:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0203 A[Catch: Exception -> 0x001c, TryCatch #4 {Exception -> 0x001c, blocks: (B:3:0x0006, B:5:0x000e, B:8:0x0021, B:10:0x0048, B:12:0x0051, B:14:0x005e, B:15:0x006f, B:17:0x0075, B:18:0x0097, B:72:0x0216, B:29:0x00de, B:30:0x00e7, B:31:0x00ec, B:35:0x00f8, B:37:0x0105, B:65:0x01af, B:67:0x01b7, B:68:0x01c2, B:70:0x01e2, B:71:0x0203, B:40:0x011c, B:42:0x0126, B:45:0x0142, B:46:0x0149, B:47:0x014a, B:49:0x0152, B:52:0x0180, B:58:0x018a, B:59:0x018d, B:60:0x018e, B:62:0x0196, B:63:0x01a4, B:13:0x0058, B:90:0x02dc, B:91:0x02e3), top: B:157:0x0006 }] */
    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        RealCall realCallA;
        Request request;
        Exception clientException;
        ResponseMessage responseMessageBuildResponseMessage;
        long statSize;
        String stringBody;
        InputStream content;
        long contentLength;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            if (this.context.getApplicationContext() != null) {
                OSSLog.logInfo(OSSUtils.buildBaseLogInfo(this.context.getApplicationContext()));
            }
            OSSLog.logDebug("[call] - ");
            OSSRequest request2 = this.context.getRequest();
            OSSUtils.ensureRequestValid(request2, this.message);
            this.message.getSigner().sign(this.message);
            if (this.context.getCancellationHandler().isCancelled()) {
                throw new InterruptedIOException("This task is cancelled!");
            }
            Request.Builder builder = new Request.Builder();
            builder.e(request2 instanceof ListBucketsRequest ? this.message.buildOSSServiceURL() : this.message.buildCanonicalURL());
            for (String name : this.message.getHeaders().keySet()) {
                String value = (String) this.message.getHeaders().get(name);
                m.f(name, "name");
                m.f(value, "value");
                builder.f45142c.a(name, value);
            }
            String str = (String) this.message.getHeaders().get(HttpHeaders.CONTENT_TYPE);
            OSSLog.logDebug("request method = " + this.message.getMethod());
            int i11 = AnonymousClass1.$SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[this.message.getMethod().ordinal()];
            if (i11 == 1 || i11 == 2) {
                OSSUtils.assertTrue(str != null, "Content type can't be null when upload!");
                if (this.message.getUploadData() != null) {
                    content = new ByteArrayInputStream(this.message.getUploadData());
                    contentLength = this.message.getUploadData().length;
                } else {
                    if (this.message.getUploadFilePath() != null) {
                        File file = new File(this.message.getUploadFilePath());
                        FileInputStream fileInputStream = new FileInputStream(file);
                        long length = file.length();
                        if (length <= 0) {
                            throw new ClientException("the length of file is 0!");
                        }
                        stringBody = null;
                        content = fileInputStream;
                        statSize = length;
                    } else if (this.message.getUploadUri() != null) {
                        content = this.context.getApplicationContext().getContentResolver().openInputStream(this.message.getUploadUri());
                        try {
                            parcelFileDescriptorOpenFileDescriptor = this.context.getApplicationContext().getContentResolver().openFileDescriptor(this.message.getUploadUri(), "r");
                            try {
                                statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                                parcelFileDescriptorOpenFileDescriptor.close();
                                stringBody = null;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptorOpenFileDescriptor != null) {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptorOpenFileDescriptor = null;
                        }
                    } else if (this.message.getContent() != null) {
                        content = this.message.getContent();
                        contentLength = this.message.getContentLength();
                    } else {
                        statSize = 0;
                        stringBody = this.message.getStringBody();
                        content = null;
                    }
                    if (content != null) {
                        if (this.message.isCheckCRC64()) {
                            content = new CheckedInputStream(content, new CRC64());
                        }
                        this.message.setContent(content);
                        this.message.setContentLength(statSize);
                        builder.c(this.message.getMethod().toString(), NetworkProgressHelper.addProgressRequestBody(content, statSize, str, this.context));
                    } else if (stringBody != null) {
                        String string = this.message.getMethod().toString();
                        MediaType.f45062e.getClass();
                        builder.c(string, RequestBody.create(MediaType.Companion.b(str), stringBody.getBytes(Constants.ENCODING)));
                    } else {
                        builder.c(this.message.getMethod().toString(), RequestBody.create((MediaType) null, new byte[0]));
                    }
                }
                statSize = contentLength;
                stringBody = null;
                if (content != null) {
                    if (this.message.isCheckCRC64()) {
                        content = new CheckedInputStream(content, new CRC64());
                    }
                    this.message.setContent(content);
                    this.message.setContentLength(statSize);
                    builder.c(this.message.getMethod().toString(), NetworkProgressHelper.addProgressRequestBody(content, statSize, str, this.context));
                } else if (stringBody != null) {
                    String string2 = this.message.getMethod().toString();
                    MediaType.f45062e.getClass();
                    builder.c(string2, RequestBody.create(MediaType.Companion.b(str), stringBody.getBytes(Constants.ENCODING)));
                } else {
                    builder.c(this.message.getMethod().toString(), RequestBody.create((MediaType) null, new byte[0]));
                }
            } else if (i11 == 3) {
                builder.c("GET", null);
            } else if (i11 == 4) {
                builder.c("HEAD", null);
            } else if (i11 == 5) {
                builder.c("DELETE", RequestBody.EMPTY);
            }
            request = new Request(builder);
            try {
                if (request2 instanceof GetObjectRequest) {
                    this.client = NetworkProgressHelper.addProgressResponseListener(this.client, this.context);
                    OSSLog.logDebug("getObject");
                }
                realCallA = this.client.a(request);
                try {
                    this.context.getCancellationHandler().setCall(realCallA);
                    Response responseC = realCallA.c();
                    if (OSSLog.isEnableLog()) {
                        TreeMap treeMapF = responseC.f45163f.f();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("response:---------------------\n");
                        sb2.append("response code: " + responseC.f45161d + " for url: " + request.f45134a + "\n");
                        for (String str2 : treeMapF.keySet()) {
                            sb2.append("responseHeader [" + str2 + "]: ");
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append((String) ((List) treeMapF.get(str2)).get(0));
                            sb3.append("\n");
                            sb2.append(sb3.toString());
                        }
                        OSSLog.logDebug(sb2.toString());
                    }
                    responseMessageBuildResponseMessage = buildResponseMessage(this.message, responseC);
                    clientException = null;
                } catch (Exception e8) {
                    e = e8;
                    OSSLog.logError("Encounter local execpiton: " + e.toString());
                    if (OSSLog.isEnableLog()) {
                        e.printStackTrace();
                    }
                    clientException = new ClientException(e.getMessage(), e);
                    responseMessageBuildResponseMessage = null;
                }
            } catch (Exception e10) {
                e = e10;
                realCallA = null;
            }
            if (clientException == null && (responseMessageBuildResponseMessage.getStatusCode() == 203 || responseMessageBuildResponseMessage.getStatusCode() >= 300)) {
                clientException = ResponseParsers.parseResponseErrorXML(responseMessageBuildResponseMessage, request.f45135b.equals("HEAD"));
            } else if (clientException == null) {
                try {
                    T t6 = (T) this.responseParser.parse(responseMessageBuildResponseMessage);
                    if (this.context.getCompletedCallback() != null) {
                        this.context.getCompletedCallback().onSuccess(this.context.getRequest(), t6);
                    }
                    return t6;
                } catch (IOException e11) {
                    clientException = new ClientException(e11.getMessage(), e11);
                }
            }
            if ((realCallA != null && realCallA.Q) || this.context.getCancellationHandler().isCancelled()) {
                clientException = new ClientException("Task is cancelled!", clientException.getCause(), Boolean.TRUE);
            }
            OSSRetryType oSSRetryTypeShouldRetry = this.retryHandler.shouldRetry(clientException, this.currentRetryCount);
            OSSLog.logError("[run] - retry, retry type: " + oSSRetryTypeShouldRetry);
            if (oSSRetryTypeShouldRetry == OSSRetryType.OSSRetryTypeShouldRetry) {
                this.currentRetryCount++;
                if (this.context.getRetryCallback() != null) {
                    this.context.getRetryCallback().onRetryCallback();
                }
                try {
                    Thread.sleep(this.retryHandler.timeInterval(this.currentRetryCount, oSSRetryTypeShouldRetry));
                } catch (InterruptedException e12) {
                    Thread.currentThread().interrupt();
                    e12.printStackTrace();
                }
                return (T) call();
            }
            if (oSSRetryTypeShouldRetry != OSSRetryType.OSSRetryTypeShouldFixedTimeSkewedAndRetry) {
                if (clientException instanceof ClientException) {
                    if (this.context.getCompletedCallback() == null) {
                        throw clientException;
                    }
                    this.context.getCompletedCallback().onFailure(this.context.getRequest(), (ClientException) clientException, null);
                    throw clientException;
                }
                if (this.context.getCompletedCallback() == null) {
                    throw clientException;
                }
                this.context.getCompletedCallback().onFailure(this.context.getRequest(), null, (ServiceException) clientException);
                throw clientException;
            }
            if (responseMessageBuildResponseMessage != null) {
                String str3 = (String) responseMessageBuildResponseMessage.getHeaders().get(HttpHeaders.DATE);
                try {
                    DateUtil.setCurrentServerTime(DateUtil.parseRfc822Date(str3).getTime());
                    this.message.getHeaders().put(HttpHeaders.DATE, str3);
                } catch (Exception unused) {
                    OSSLog.logError("[error] - synchronize time, reponseDate:" + str3);
                }
            }
            this.currentRetryCount++;
            if (this.context.getRetryCallback() != null) {
                this.context.getRetryCallback().onRetryCallback();
            }
            return (T) call();
        } catch (Exception e13) {
            e = e13;
            realCallA = null;
            request = null;
        }
    }
}
