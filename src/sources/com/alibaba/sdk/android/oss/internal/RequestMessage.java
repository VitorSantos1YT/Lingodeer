package com.alibaba.sdk.android.oss.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.HttpMethod;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.auth.OSSCredentialProvider;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.alibaba.sdk.android.oss.common.utils.HttpUtil;
import com.alibaba.sdk.android.oss.common.utils.HttpdnsMini;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.model.BucketLifecycleRule;
import com.alibaba.sdk.android.oss.signer.RequestSigner;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import defpackage.e;
import ep.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class RequestMessage extends HttpMessage {
    private String bucketName;
    private boolean checkCRC64;
    private OSSCredentialProvider credentialProvider;
    private URI endpoint;
    private String ipWithHeader;
    private HttpMethod method;
    private String objectKey;
    private URI service;
    private RequestSigner signer;
    private byte[] uploadData;
    private String uploadFilePath;
    private Uri uploadUri;
    private boolean isAuthorizationRequired = true;
    private Map<String, String> parameters = new LinkedHashMap();
    private boolean httpDnsEnable = false;
    private boolean pathStyleAccessEnable = false;
    private boolean customPathPrefixEnable = false;
    private boolean isInCustomCnameExcludeList = false;
    private boolean useUrlSignature = false;
    private Set<String> additionalHeaderNames = new HashSet();

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ void addHeader(String str, String str2) {
        super.addHeader(str, str2);
    }

    public void addParameter(String str, String str2) {
        this.parameters.put(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ed  */
    public String buildCanonicalURL() {
        boolean z11 = false;
        OSSUtils.assertTrue(this.endpoint != null, "Endpoint haven't been set!");
        String scheme = this.endpoint.getScheme();
        String host = this.endpoint.getHost();
        String path = this.endpoint.getPath();
        int port = this.endpoint.getPort();
        String ipByHostAsync = null;
        String strValueOf = port != -1 ? String.valueOf(port) : null;
        if (TextUtils.isEmpty(host)) {
            OSSLog.logDebug("endpoint url : " + this.endpoint.toString());
        }
        OSSLog.logDebug(" scheme : " + scheme);
        OSSLog.logDebug(" originHost : " + host);
        OSSLog.logDebug(" port : " + strValueOf);
        String string = scheme + "://" + host;
        if (!TextUtils.isEmpty(strValueOf)) {
            string = a.D(string, ":", strValueOf);
        }
        if (!TextUtils.isEmpty(this.bucketName)) {
            if (OSSUtils.isOssOriginHost(host)) {
                String strU = p.u(new StringBuilder(), this.bucketName, ".", host);
                if (isHttpDnsEnable()) {
                    ipByHostAsync = HttpdnsMini.getInstance().getIpByHostAsync(strU);
                } else {
                    OSSLog.logDebug("[buildCannonicalURL], disable httpdns");
                }
                addHeader(HttpHeaders.HOST, strU);
                string = !TextUtils.isEmpty(ipByHostAsync) ? a.D(scheme, "://", ipByHostAsync) : a.D(scheme, "://", strU);
            } else if (this.isInCustomCnameExcludeList) {
                if (this.pathStyleAccessEnable) {
                    z11 = true;
                } else {
                    string = p.u(e.r(scheme, "://"), this.bucketName, ".", host);
                }
            } else if (OSSUtils.isValidateIP(host)) {
                if (OSSUtils.isEmptyString(this.ipWithHeader)) {
                    z11 = true;
                } else {
                    addHeader(HttpHeaders.HOST, getIpWithHeader());
                }
            }
        }
        if (this.customPathPrefixEnable && path != null) {
            string = e.m(string, path);
        }
        if (z11) {
            StringBuilder sbR = e.r(string, "/");
            sbR.append(this.bucketName);
            string = sbR.toString();
        }
        if (!TextUtils.isEmpty(this.objectKey)) {
            StringBuilder sbR2 = e.r(string, "/");
            sbR2.append(HttpUtil.urlEncode(this.objectKey, "utf-8"));
            string = sbR2.toString();
        }
        String strParamToQueryString = OSSUtils.paramToQueryString(this.parameters, "utf-8");
        StringBuilder sb2 = new StringBuilder("request---------------------\n");
        sb2.append("request url=" + string + "\n");
        sb2.append("request params=" + strParamToQueryString + "\n");
        for (String str : getHeaders().keySet()) {
            sb2.append("requestHeader [" + str + "]: ");
            sb2.append(((String) getHeaders().get(str)) + "\n");
        }
        OSSLog.logDebug(sb2.toString());
        return OSSUtils.isEmptyString(strParamToQueryString) ? string : a.D(string, "?", strParamToQueryString);
    }

    public String buildOSSServiceURL() {
        String ipByHostAsync;
        OSSUtils.assertTrue(this.service != null, "Service haven't been set!");
        String host = this.service.getHost();
        String scheme = this.service.getScheme();
        if (isHttpDnsEnable() && scheme.equalsIgnoreCase("http")) {
            ipByHostAsync = HttpdnsMini.getInstance().getIpByHostAsync(host);
        } else {
            OSSLog.logDebug("[buildOSSServiceURL], disable httpdns or http is not need httpdns");
            ipByHostAsync = null;
        }
        if (ipByHostAsync == null) {
            ipByHostAsync = host;
        }
        getHeaders().put(HttpHeaders.HOST, host);
        String str = scheme + "://" + ipByHostAsync;
        String strParamToQueryString = OSSUtils.paramToQueryString(this.parameters, "utf-8");
        return OSSUtils.isEmptyString(strParamToQueryString) ? str : a.D(str, "?", strParamToQueryString);
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ void close() throws IOException {
        super.close();
    }

    public void createBucketRequestBodyMarshall(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        if (map != null) {
            stringBuffer.append("<CreateBucketConfiguration>");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                stringBuffer.append("<" + entry.getKey() + ">" + entry.getValue() + "</" + entry.getKey() + ">");
            }
            stringBuffer.append("</CreateBucketConfiguration>");
            setStringBody(stringBuffer.toString());
        }
    }

    public byte[] deleteMultipleObjectRequestBodyMarshall(List<String> list, boolean z11) throws UnsupportedEncodingException {
        StringBuffer stringBuffer = new StringBuffer("<Delete>");
        if (z11) {
            stringBuffer.append("<Quiet>true</Quiet>");
        } else {
            stringBuffer.append("<Quiet>false</Quiet>");
        }
        for (String str : list) {
            stringBuffer.append("<Object><Key>");
            stringBuffer.append(OSSUtils.escapeKey(str));
            stringBuffer.append("</Key></Object>");
        }
        stringBuffer.append("</Delete>");
        String string = stringBuffer.toString();
        byte[] bytes = string.getBytes("utf-8");
        setStringBody(string);
        return bytes;
    }

    public Set<String> getAdditionalHeaderNames() {
        return this.additionalHeaderNames;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ InputStream getContent() {
        return super.getContent();
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ long getContentLength() {
        return super.getContentLength();
    }

    public OSSCredentialProvider getCredentialProvider() {
        return this.credentialProvider;
    }

    public URI getEndpoint() {
        return this.endpoint;
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ Map getHeaders() {
        return super.getHeaders();
    }

    public String getIpWithHeader() {
        return this.ipWithHeader;
    }

    public HttpMethod getMethod() {
        return this.method;
    }

    public String getObjectKey() {
        return this.objectKey;
    }

    public Map<String, String> getParameters() {
        return this.parameters;
    }

    public URI getService() {
        return this.service;
    }

    public RequestSigner getSigner() {
        return this.signer;
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ String getStringBody() {
        return super.getStringBody();
    }

    public byte[] getUploadData() {
        return this.uploadData;
    }

    public String getUploadFilePath() {
        return this.uploadFilePath;
    }

    public Uri getUploadUri() {
        return this.uploadUri;
    }

    public boolean isAuthorizationRequired() {
        return this.isAuthorizationRequired;
    }

    public boolean isCheckCRC64() {
        return this.checkCRC64;
    }

    public boolean isCustomPathPrefixEnable() {
        return this.customPathPrefixEnable;
    }

    public boolean isHttpDnsEnable() {
        return this.httpDnsEnable;
    }

    public boolean isInCustomCnameExcludeList() {
        return this.isInCustomCnameExcludeList;
    }

    public boolean isPathStyleAccessEnable() {
        return this.pathStyleAccessEnable;
    }

    public boolean isUseUrlSignature() {
        return this.useUrlSignature;
    }

    public void putBucketLifecycleRequestBodyMarshall(ArrayList<BucketLifecycleRule> arrayList) {
        StringBuffer stringBuffer = new StringBuffer("<LifecycleConfiguration>");
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            BucketLifecycleRule bucketLifecycleRule = arrayList.get(i11);
            i11++;
            BucketLifecycleRule bucketLifecycleRule2 = bucketLifecycleRule;
            stringBuffer.append("<Rule>");
            if (bucketLifecycleRule2.getIdentifier() != null) {
                stringBuffer.append("<ID>" + bucketLifecycleRule2.getIdentifier() + "</ID>");
            }
            if (bucketLifecycleRule2.getPrefix() != null) {
                stringBuffer.append("<Prefix>" + bucketLifecycleRule2.getPrefix() + "</Prefix>");
            }
            StringBuilder sb2 = new StringBuilder("<Status>");
            sb2.append(bucketLifecycleRule2.getStatus() ? "Enabled" : "Disabled");
            sb2.append("</Status>");
            stringBuffer.append(sb2.toString());
            if (bucketLifecycleRule2.getDays() != null) {
                stringBuffer.append("<Days>" + bucketLifecycleRule2.getDays() + "</Days>");
            } else if (bucketLifecycleRule2.getExpireDate() != null) {
                stringBuffer.append("<Date>" + bucketLifecycleRule2.getExpireDate() + "</Date>");
            }
            if (bucketLifecycleRule2.getMultipartDays() != null) {
                stringBuffer.append("<AbortMultipartUpload><Days>" + bucketLifecycleRule2.getMultipartDays() + "</Days></AbortMultipartUpload>");
            } else if (bucketLifecycleRule2.getMultipartExpireDate() != null) {
                stringBuffer.append("<AbortMultipartUpload><Date>" + bucketLifecycleRule2.getMultipartDays() + "</Date></AbortMultipartUpload>");
            }
            if (bucketLifecycleRule2.getIADays() != null) {
                stringBuffer.append("<Transition><Days>" + bucketLifecycleRule2.getIADays() + "</Days><StorageClass>IA</StorageClass></Transition>");
            } else if (bucketLifecycleRule2.getIAExpireDate() != null) {
                stringBuffer.append("<Transition><Date>" + bucketLifecycleRule2.getIAExpireDate() + "</Date><StorageClass>IA</StorageClass></Transition>");
            } else if (bucketLifecycleRule2.getArchiveDays() != null) {
                stringBuffer.append("<Transition><Days>" + bucketLifecycleRule2.getArchiveDays() + "</Days><StorageClass>Archive</StorageClass></Transition>");
            } else if (bucketLifecycleRule2.getArchiveExpireDate() != null) {
                stringBuffer.append("<Transition><Date>" + bucketLifecycleRule2.getArchiveExpireDate() + "</Date><StorageClass>Archive</StorageClass></Transition>");
            }
            stringBuffer.append("</Rule>");
        }
        stringBuffer.append("</LifecycleConfiguration>");
        setStringBody(stringBuffer.toString());
    }

    public void putBucketLoggingRequestBodyMarshall(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer("<BucketLoggingStatus>");
        if (str != null) {
            stringBuffer.append("<LoggingEnabled><TargetBucket>" + str + "</TargetBucket>");
            if (str2 != null) {
                stringBuffer.append("<TargetPrefix>" + str2 + "</TargetPrefix>");
            }
            stringBuffer.append("</LoggingEnabled>");
        }
        stringBuffer.append("</BucketLoggingStatus>");
        setStringBody(stringBuffer.toString());
    }

    public void putBucketRefererRequestBodyMarshall(ArrayList<String> arrayList, boolean z11) {
        StringBuffer stringBuffer = new StringBuffer("<RefererConfiguration>");
        StringBuilder sb2 = new StringBuilder("<AllowEmptyReferer>");
        sb2.append(z11 ? "true" : "false");
        sb2.append("</AllowEmptyReferer>");
        stringBuffer.append(sb2.toString());
        if (arrayList != null && arrayList.size() > 0) {
            stringBuffer.append("<RefererList>");
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                String str = arrayList.get(i11);
                i11++;
                stringBuffer.append("<Referer>" + str + "</Referer>");
            }
            stringBuffer.append("</RefererList>");
        }
        stringBuffer.append("</RefererConfiguration>");
        setStringBody(stringBuffer.toString());
    }

    public void setAdditionalHeaderNames(Set<String> set) {
        this.additionalHeaderNames = set;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setCheckCRC64(boolean z11) {
        this.checkCRC64 = z11;
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ void setContent(InputStream inputStream) {
        super.setContent(inputStream);
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ void setContentLength(long j11) {
        super.setContentLength(j11);
    }

    public void setCredentialProvider(OSSCredentialProvider oSSCredentialProvider) {
        this.credentialProvider = oSSCredentialProvider;
    }

    public void setCustomPathPrefixEnable(boolean z11) {
        this.customPathPrefixEnable = z11;
    }

    public void setEndpoint(URI uri) {
        this.endpoint = uri;
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ void setHeaders(Map map) {
        super.setHeaders(map);
    }

    public void setHttpDnsEnable(boolean z11) {
        this.httpDnsEnable = z11;
    }

    public void setIpWithHeader(String str) {
        this.ipWithHeader = str;
    }

    public void setIsAuthorizationRequired(boolean z11) {
        this.isAuthorizationRequired = z11;
    }

    public void setIsInCustomCnameExcludeList(boolean z11) {
        this.isInCustomCnameExcludeList = z11;
    }

    public void setMethod(HttpMethod httpMethod) {
        this.method = httpMethod;
    }

    public void setObjectKey(String str) {
        this.objectKey = str;
    }

    public void setParameters(Map<String, String> map) {
        this.parameters = map;
    }

    public void setPathStyleAccessEnable(boolean z11) {
        this.pathStyleAccessEnable = z11;
    }

    public void setService(URI uri) {
        this.service = uri;
    }

    public void setSigner(RequestSigner requestSigner) {
        this.signer = requestSigner;
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ void setStringBody(String str) {
        super.setStringBody(str);
    }

    public void setUploadData(byte[] bArr) {
        this.uploadData = bArr;
    }

    public void setUploadFilePath(String str) {
        this.uploadFilePath = str;
    }

    public void setUploadUri(Uri uri) {
        this.uploadUri = uri;
    }

    public void setUseUrlSignature(boolean z11) {
        this.useUrlSignature = z11;
    }

    public byte[] putObjectTaggingRequestBodyMarshall(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuffer stringBuffer = new StringBuffer("<Tagging><TagSet>");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                stringBuffer.append("<Tag><Key>");
                stringBuffer.append(entry.getKey());
                stringBuffer.append("</Key><Value>");
                stringBuffer.append(entry.getValue());
                stringBuffer.append("</Value></Tag>");
            }
        }
        stringBuffer.append(ualZoVVCQs.oXZkcAJnrmUuaPi);
        String string = stringBuffer.toString();
        byte[] bytes = string.getBytes("utf-8");
        setStringBody(string);
        return bytes;
    }
}
