package com.stkouyu;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Base64;
import androidx.drawerlayout.widget.ktFt.FpIL;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.stkouyu.listener.OnInitEngineListener;
import com.stkouyu.listener.OnNetworkListener;
import com.stkouyu.listener.OnPlayerListener;
import com.stkouyu.listener.OnRecordBufferListener;
import com.stkouyu.listener.OnRecordListener;
import com.stkouyu.listener.OnRecorderListener;
import com.stkouyu.listener.OnSTRecorderListener;
import com.stkouyu.setting.EngineSetting;
import com.stkouyu.setting.RecordSetting;
import com.stkouyu.util.AiUtil;
import com.stkouyu.util.CountDownTimer;
import com.stkouyu.util.DeviceUtils;
import com.stkouyu.util.HandlerUtils;
import com.stkouyu.util.LogCat;
import com.stkouyu.util.MyLog;
import com.stkouyu.util.MyUtil;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lt.AJC.PQgum;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class SkEgnManager {
    public static final int CODE_CREATE_ENGINE_FAIL = 0;
    public static final int CODE_INIT_ENGINE_FAILED = 3;
    public static final int CODE_INIT_ENGINE_SUCCESS = 2;
    public static final int CODE_NETWORK_ON_AVAILABLE = 17;
    public static final int CODE_NETWORK_ON_LOST = 18;
    public static final int CODE_PLAY_END = 8;
    public static final int CODE_PLAY_START = 15;
    public static final int CODE_PLAY_START_FAIL = 16;
    public static final int CODE_PLAY_TICK = 19;
    public static final int CODE_RECORDER_END = 14;
    public static final int CODE_RECORDER_ONSTARTRECORDFAIL = 11;
    public static final int CODE_RECORDER_PAUSE = 13;
    public static final int CODE_RECORDER_START = 10;
    public static final int CODE_RECORDER_TICK = 12;
    public static final int CODE_RECORD_BUFFER = 9;
    public static final int CODE_RECORD_END = 7;
    public static final int CODE_RECORD_RECORDING = 6;
    public static final int CODE_RECORD_START = 5;
    public static final int CODE_SKEGN_START_FAIL = -1;
    public static final int CODE_START_INIT_ENGINE = 1;
    public static final String SERVER_TYPE_CLOUD = "cloud";
    public static final String SERVER_TYPE_MULTI = "multi";
    public static final String SERVER_TYPE_NATIVE = "native";
    private static final String TAG = "17kouyu";
    private static SkEgnManager mSkEgnManager;
    private SkEgn.skegn_callback callback;
    private boolean isObtainProvisionSuccess;
    private boolean isRecordCancel;
    private Context mContext;
    private String mCurrentEngine;
    private EngineSetting mCurrentEngineSetting;
    private RecordSetting mCurrentRecordSetting;
    private Handler mHandler;
    private NetworkTask mNetworkTask;
    private OnInitEngineListener mOnInitEngineListener;
    private OnNetworkListener mOnNetworkListener;
    private OnPlayerListener mOnPlayerListener;
    private OnRecordBufferListener mOnRecordBufferListener;
    private OnRecordListener mOnRecordListener;
    private OnRecorderListener mOnRecorderListener;
    private CountDownTimer mRecordTimer;
    private String mSerialNumber;
    private String mp3Path;
    private JSONObject params;
    private File provisionFile;
    private String recordedPath;
    private STRecorder recorder;
    private STRecorderExternal recorderExternal;
    private String resultBuffer;
    engine_status status1;
    private JSONObject vadObj;
    public long engine = 0;
    private boolean isAudioFileEval = false;
    private boolean isAudioFileEvalFirst = false;
    private boolean isRetrying = false;
    private boolean isStopFeed = false;
    private boolean networkStatus = true;
    private List<String> autoRetryErrIds = new ArrayList(Arrays.asList("20009", "20027"));
    private int evalCount = 0;
    private List<String> multiEngineRetryCoreTypes = Arrays.asList(CoreType.EN_WORD_EVAL, CoreType.WORD_EVAL_PRO, CoreType.EN_SENT_EVAL, CoreType.SENT_EVAL_PRO, CoreType.EN_PARA_EVAL, CoreType.EN_OPEN_EVAL, CoreType.EN_CHOICE_REC, CoreType.EN_ALIGN_EVAL, CoreType.CN_WORD_EVAL, CoreType.CN_SENT_EVAL, CoreType.CN_PARA_EVAL);
    private Timer TimedPushlogtimer = null;
    private volatile boolean isInitializing = false;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface InquireProvisionCallback {
        void run(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class NetworkTask extends AsyncTask<String, Integer, Void> {
        private NetworkTask() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(String... strArr) {
            try {
                MyLog.e(SkEgnManager.TAG, "start detect network");
                while (!isCancelled()) {
                    try {
                        boolean zPing = DeviceUtils.ping();
                        if (!zPing) {
                            MyLog.e(SkEgnManager.TAG, "network status:" + zPing);
                        }
                        if (zPing != SkEgnManager.this.networkStatus) {
                            SkEgnManager.this.networkStatus = zPing;
                            if (SkEgnManager.this.mOnNetworkListener != null) {
                                Message message = new Message();
                                if (SkEgnManager.this.networkStatus) {
                                    message.what = 17;
                                } else {
                                    message.what = 18;
                                }
                                SkEgnManager.this.mHandler.sendMessage(message);
                            }
                        }
                    } catch (Exception e8) {
                        MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                        e8.printStackTrace();
                    }
                    if (SkEgnManager.this.networkStatus) {
                        Thread.sleep(2000L);
                    } else {
                        Thread.sleep(3000L);
                    }
                }
                return null;
            } catch (Exception e10) {
                MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                e10.printStackTrace();
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum engine_status {
        IDLE,
        RECORDING,
        PAUSED,
        STOP
    }

    public SkEgnManager(Context context) {
        getHandlerOnMainThread();
        this.status1 = engine_status.IDLE;
        this.mSerialNumber = BuildConfig.VERSION_NAME;
        this.provisionFile = null;
        this.recorder = null;
        this.recorderExternal = null;
        this.params = null;
        this.mContext = context.getApplicationContext();
    }

    public static /* synthetic */ int access$408(SkEgnManager skEgnManager) {
        int i11 = skEgnManager.evalCount;
        skEgnManager.evalCount = i11 + 1;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelRecordTimer() {
        CountDownTimer countDownTimer = this.mRecordTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private boolean checkAppKeyAndSecretKey(String str, String str2) {
        if (!MyUtil.isNull(str)) {
            return true;
        }
        MyLog.e(TAG, "appkey is required!");
        return false;
    }

    private void checkProvisionFile(String str, String str2, boolean z11) {
        File[] fileArrListFiles = this.mContext.getExternalFilesDir(null).listFiles();
        int i11 = 0;
        if (z11) {
            if (this.mContext.getSharedPreferences(TAG, 0).getBoolean("isFirst", true)) {
                int length = fileArrListFiles.length;
                while (i11 < length) {
                    File file = fileArrListFiles[i11];
                    if (AppConfig.PROVISION.equals(file.getName())) {
                        file.delete();
                    }
                    i11++;
                }
                saveProvision(str, str2);
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (AppConfig.PROVISION.equals(file2.getName())) {
                    this.provisionFile = file2;
                }
            }
            if (this.provisionFile == null) {
                this.isObtainProvisionSuccess = false;
                saveProvision(str, str2);
                return;
            }
            return;
        }
        if (!this.isObtainProvisionSuccess) {
            if (MyUtil.isExistsProvisionFileInDD(this.mContext)) {
                int length2 = fileArrListFiles.length;
                while (i11 < length2) {
                    File file3 = fileArrListFiles[i11];
                    if (AppConfig.PROVISION.equals(file3.getName())) {
                        file3.delete();
                    }
                    i11++;
                }
            }
            saveProvision(str, str2);
            return;
        }
        for (File file4 : fileArrListFiles) {
            if (AppConfig.PROVISION.equals(file4.getName())) {
                this.provisionFile = file4;
            }
        }
        if (this.provisionFile == null) {
            this.isObtainProvisionSuccess = false;
            saveProvision(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destoryRecordTimer() {
        CountDownTimer countDownTimer = this.mRecordTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.mRecordTimer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void existsAudioTrans(RecordSetting recordSetting) {
        existsAudioTrans(recordSetting, null, null);
    }

    private void flushResultBuffer() {
        Message message = new Message();
        message.what = 7;
        message.obj = this.resultBuffer;
        this.mHandler.sendMessage(message);
        this.resultBuffer = BuildConfig.VERSION_NAME;
    }

    private Context getContext() {
        return this.mContext;
    }

    private void getHandlerOnMainThread() {
        this.mHandler = new Handler(Looper.getMainLooper()) { // from class: com.stkouyu.SkEgnManager.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        if (SkEgnManager.this.mOnInitEngineListener != null) {
                            SkEgnManager.this.mOnInitEngineListener.onStartInitEngine();
                        }
                        break;
                    case 2:
                        if (SkEgnManager.this.mOnInitEngineListener != null) {
                            SkEgnManager.this.mOnInitEngineListener.onInitEngineSuccess();
                        }
                        break;
                    case 3:
                        if (SkEgnManager.this.mOnInitEngineListener != null) {
                            SkEgnManager.this.mOnInitEngineListener.onInitEngineFailed((String) message.obj);
                        }
                        break;
                    case 5:
                        MyLog.e(SkEgnManager.TAG, "SkEgnManager.CODE_RECORD_START");
                        if (SkEgnManager.this.mOnRecordListener != null) {
                            SkEgnManager.this.mOnRecordListener.onRecordStart();
                        }
                        break;
                    case 6:
                        Bundle data = message.getData();
                        if (data != null) {
                            int i11 = data.getInt("vad_status");
                            int i12 = data.getInt("sound_intensity");
                            if (SkEgnManager.this.mOnRecordListener != null) {
                                SkEgnManager.this.mOnRecordListener.onRecording(i11, i12);
                            }
                            if (SkEgnManager.this.mOnRecorderListener != null) {
                                SkEgnManager.this.mOnRecorderListener.onRecording(i11, i12);
                            }
                        }
                        break;
                    case 7:
                        MyLog.e(SkEgnManager.TAG, MzwEyWCkjXL.fcjMVTU);
                        StringBuilder sb2 = new StringBuilder("recordlinstener:");
                        sb2.append(SkEgnManager.this.mOnRecordListener != null);
                        MyLog.e(SkEgnManager.TAG, sb2.toString());
                        StringBuilder sb3 = new StringBuilder("recorderlinstener:");
                        sb3.append(SkEgnManager.this.mOnRecorderListener != null);
                        MyLog.e(SkEgnManager.TAG, sb3.toString());
                        if (SkEgnManager.this.mOnRecordListener != null) {
                            SkEgnManager.this.mOnRecordListener.onRecordEnd((String) message.obj);
                        }
                        if (SkEgnManager.this.mOnRecorderListener != null) {
                            SkEgnManager.this.mOnRecorderListener.onScore((String) message.obj);
                        }
                        break;
                    case 8:
                        MyLog.e(SkEgnManager.TAG, "SkEgnManager.CODE_PLAY_END");
                        if (SkEgnManager.this.mOnPlayerListener != null) {
                            SkEgnManager.this.mOnPlayerListener.onPlayEnd();
                        }
                        break;
                    case 9:
                        MyLog.e(SkEgnManager.TAG, "SkEgnManager.CODE_RECORD_BUFFER");
                        Bundle data2 = message.getData();
                        if (data2 != null) {
                            byte[] byteArray = data2.getByteArray("buffer");
                            int i13 = data2.getInt("size");
                            if (SkEgnManager.this.mOnRecordBufferListener != null) {
                                SkEgnManager.this.mOnRecordBufferListener.onRecordBuffer(byteArray, i13);
                            }
                        }
                        break;
                    case 10:
                        MyLog.e(SkEgnManager.TAG, "SkEgnManager.CODE_RECORDER_START");
                        if (SkEgnManager.this.mOnRecorderListener != null) {
                            SkEgnManager.this.mOnRecorderListener.onStart();
                        }
                        break;
                    case 11:
                        MyLog.e(SkEgnManager.TAG, "SkEgnManager.CODE_RECORDER_ONSTARTRECORDFAIL");
                        if (SkEgnManager.this.mOnRecorderListener != null) {
                            SkEgnManager.this.mOnRecorderListener.onStartRecordFail((String) message.obj);
                        }
                        break;
                    case 12:
                        MyLog.e(SkEgnManager.TAG, "SkEgnManager.CODE_RECORDER_TICK");
                        Bundle data3 = message.getData();
                        if (data3 != null && SkEgnManager.this.mOnRecorderListener != null) {
                            SkEgnManager.this.mOnRecorderListener.onTick(data3.getLong("millisUntilFinished"), data3.getDouble("percentUntilFinished"));
                            break;
                        }
                        break;
                    case 13:
                        MyLog.e(SkEgnManager.TAG, "SkEgnManager.CODE_RECORDER_PAUSE");
                        if (SkEgnManager.this.mOnRecorderListener != null) {
                            SkEgnManager.this.mOnRecorderListener.onPause();
                        }
                        break;
                    case 14:
                        MyLog.e(SkEgnManager.TAG, "SkEgnManager.CODE_RECORDER_END");
                        if (SkEgnManager.this.mOnRecorderListener != null) {
                            SkEgnManager.this.mOnRecorderListener.onRecordEnd();
                        }
                        break;
                    case 15:
                        MyLog.e(SkEgnManager.TAG, "SkEgnManager.CODE_PLAY_START");
                        if (SkEgnManager.this.mOnPlayerListener != null) {
                            SkEgnManager.this.mOnPlayerListener.onPlayStart();
                        }
                        break;
                    case 16:
                        MyLog.e(SkEgnManager.TAG, "SkEgnManager.CODE_PLAY_START_FAIL");
                        if (SkEgnManager.this.mOnPlayerListener != null) {
                            SkEgnManager.this.mOnPlayerListener.onPlayStartFail((String) message.obj);
                        }
                        break;
                    case 17:
                        MyLog.e(SkEgnManager.TAG, "SkEgnManager.CODE_NETWORK_ON_AVAILABLE");
                        if (SkEgnManager.this.mOnNetworkListener != null) {
                            SkEgnManager.this.mOnNetworkListener.onAvailable();
                        }
                        break;
                    case 18:
                        MyLog.e(SkEgnManager.TAG, "SkEgnManager.CODE_NETWORK_ON_LOST");
                        if (SkEgnManager.this.mOnNetworkListener != null) {
                            SkEgnManager.this.mOnNetworkListener.onLost();
                        }
                        break;
                    case 19:
                        Bundle data4 = message.getData();
                        if (data4 != null && SkEgnManager.this.mOnPlayerListener != null) {
                            SkEgnManager.this.mOnPlayerListener.onTick(data4.getLong("playbackDuration"), data4.getDouble("playbackPercent"));
                            break;
                        }
                        break;
                }
            }
        };
    }

    public static SkEgnManager getInstance(Context context) {
        SkEgnManager skEgnManager = mSkEgnManager;
        if (skEgnManager != null) {
            return skEgnManager;
        }
        SkEgnManager skEgnManager2 = new SkEgnManager(context);
        mSkEgnManager = skEgnManager2;
        return skEgnManager2;
    }

    private void getSerialNumber(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", str);
            jSONObject.put("secretKey", str2);
        } catch (Exception e8) {
            MyLog.e(TAG, "===>ST Exception");
            e8.printStackTrace();
        }
        MyLog.e(TAG, "result===>" + MyUtil.getSerialNumber(this.mContext, jSONObject.toString()));
        try {
            this.mSerialNumber = new JSONObject(MyUtil.getSerialNumber(this.mContext, jSONObject.toString())).getString("serialNumber");
            this.mContext.getSharedPreferences(TAG, 0).edit().putString("serialNumber", this.mSerialNumber).commit();
        } catch (Exception e10) {
            MyLog.e(TAG, "===>ST Exception");
            MyLog.e(TAG, MyUtil.getSerialNumber(this.mContext, jSONObject.toString()));
            e10.printStackTrace();
        }
    }

    private SkEgn.skegn_callback mkCallback() {
        return new SkEgn.skegn_callback() { // from class: com.stkouyu.SkEgnManager.1
            /* JADX WARN: Code duplicated, block: B:105:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:52:0x0167 A[Catch: Exception -> 0x0172, TryCatch #4 {Exception -> 0x0172, blocks: (B:50:0x015c, B:52:0x0167, B:55:0x0175, B:57:0x017d, B:59:0x0189, B:61:0x0191, B:63:0x0197, B:67:0x01ab, B:69:0x01b7, B:71:0x01ea, B:73:0x01fc, B:75:0x020c, B:77:0x0222, B:79:0x0242, B:81:0x0255, B:82:0x0260, B:84:0x0272, B:85:0x027d), top: B:105:0x015c }] */
            /* JADX WARN: Code duplicated, block: B:79:0x0242 A[Catch: Exception -> 0x0172, TryCatch #4 {Exception -> 0x0172, blocks: (B:50:0x015c, B:52:0x0167, B:55:0x0175, B:57:0x017d, B:59:0x0189, B:61:0x0191, B:63:0x0197, B:67:0x01ab, B:69:0x01b7, B:71:0x01ea, B:73:0x01fc, B:75:0x020c, B:77:0x0222, B:79:0x0242, B:81:0x0255, B:82:0x0260, B:84:0x0272, B:85:0x027d), top: B:105:0x015c }] */
            /* JADX WARN: Code duplicated, block: B:81:0x0255 A[Catch: Exception -> 0x0172, TryCatch #4 {Exception -> 0x0172, blocks: (B:50:0x015c, B:52:0x0167, B:55:0x0175, B:57:0x017d, B:59:0x0189, B:61:0x0191, B:63:0x0197, B:67:0x01ab, B:69:0x01b7, B:71:0x01ea, B:73:0x01fc, B:75:0x020c, B:77:0x0222, B:79:0x0242, B:81:0x0255, B:82:0x0260, B:84:0x0272, B:85:0x027d), top: B:105:0x015c }] */
            /* JADX WARN: Code duplicated, block: B:84:0x0272 A[Catch: Exception -> 0x0172, TryCatch #4 {Exception -> 0x0172, blocks: (B:50:0x015c, B:52:0x0167, B:55:0x0175, B:57:0x017d, B:59:0x0189, B:61:0x0191, B:63:0x0197, B:67:0x01ab, B:69:0x01b7, B:71:0x01ea, B:73:0x01fc, B:75:0x020c, B:77:0x0222, B:79:0x0242, B:81:0x0255, B:82:0x0260, B:84:0x0272, B:85:0x027d), top: B:105:0x015c }] */
            /* JADX WARN: Code duplicated, block: B:90:0x02c2 A[Catch: Exception -> 0x02d4, TryCatch #3 {Exception -> 0x02d4, blocks: (B:88:0x02b5, B:90:0x02c2, B:93:0x02d6), top: B:103:0x02b5 }] */
            @Override // com.stkouyu.SkEgn.skegn_callback
            public int run(byte[] bArr, int i11, byte[] bArr2, int i12) {
                JSONObject jSONObject;
                String string;
                if (i11 == SkEgn.SKEGN_MESSAGE_TYPE_JSON) {
                    String strTrim = new String(bArr2, 0, i12).trim();
                    if (SkEgnManager.this.mHandler != null && strTrim != null) {
                        Message message = new Message();
                        if (strTrim.contains("vad_status") && strTrim.contains("sound_intensity") && SkEgnManager.this.mCurrentRecordSetting.isVADEnabled()) {
                            try {
                                if (!SkEgnManager.this.isAudioFileEval) {
                                    SkEgnManager.this.vadObj = new JSONObject(strTrim);
                                    message.what = 6;
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("vad_status", SkEgnManager.this.vadObj.getInt("vad_status"));
                                    bundle.putInt("sound_intensity", SkEgnManager.this.vadObj.getInt("sound_intensity"));
                                    message.setData(bundle);
                                    SkEgnManager.this.mHandler.sendMessage(message);
                                }
                            } catch (Exception e8) {
                                MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                                e8.printStackTrace();
                                MyLog.e(SkEgnManager.TAG, strTrim);
                            }
                        } else if (strTrim.contains("sound_intensity")) {
                            try {
                                if (!SkEgnManager.this.isAudioFileEval) {
                                    SkEgnManager.this.vadObj = new JSONObject(strTrim);
                                    message.what = 6;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putInt("vad_status", 1);
                                    bundle2.putInt("sound_intensity", (int) SkEgnManager.this.vadObj.getDouble("sound_intensity"));
                                    message.setData(bundle2);
                                    SkEgnManager.this.mHandler.sendMessage(message);
                                }
                            } catch (Exception e10) {
                                MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                                e10.printStackTrace();
                                MyLog.e(SkEgnManager.TAG, strTrim);
                            }
                        } else if (strTrim.contains("eof") && !strTrim.contains("tokenId") && !strTrim.contains("errId")) {
                            try {
                                if (SkEgnManager.this.evalCount == 0) {
                                    SkEgnManager.this.isAudioFileEval = false;
                                    SkEgnManager.this.isAudioFileEvalFirst = false;
                                    message.what = 7;
                                    message.obj = strTrim;
                                    SkEgnManager.this.mHandler.sendMessage(message);
                                }
                            } catch (Exception e11) {
                                MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                                e11.printStackTrace();
                                MyLog.e(SkEgnManager.TAG, strTrim);
                            }
                        } else if (SkEgnManager.this.recorder == null || SkEgnManager.this.mCurrentRecordSetting == null || !SkEgnManager.this.mCurrentRecordSetting.isForceRecord()) {
                            try {
                                jSONObject = new JSONObject(strTrim);
                                if (jSONObject.getInt("eof") == 1) {
                                    SkEgnManager.this.isStopFeed = true;
                                    SkEgnManager.this.cancelRecordTimer();
                                }
                                if (SkEgnManager.this.mCurrentRecordSetting != null && SkEgnManager.this.mCurrentRecordSetting.isAutoRetry() && !SkEgnManager.this.isRetrying && strTrim.contains("errId")) {
                                    string = jSONObject.getString("errId");
                                    if (SkEgnManager.this.autoRetryErrIds.contains(string) && (string != "20009" || !SkEgnManager.this.mCurrentRecordSetting.isNetworkDiagnosis())) {
                                        SkEgnManager.this.cancel();
                                        SkEgnManager.this.isRetrying = true;
                                        MyLog.e(SkEgnManager.TAG, "===>autoRetry:".concat(strTrim));
                                        MyLog.e(SkEgnManager.TAG, "===>" + string + ",auto retry");
                                        if (SkEgnManager.this.mCurrentEngine.equals("multi") && SkEgnManager.this.mCurrentRecordSetting.getCoreProvideType().equals("cloud") && MyUtil.isNotNull(SkEgnManager.this.mCurrentRecordSetting.getCoreType()) && SkEgnManager.this.multiEngineRetryCoreTypes.contains(SkEgnManager.this.mCurrentRecordSetting.getCoreType())) {
                                            MyLog.e(SkEgnManager.TAG, "===>auto retry,change to native");
                                            SkEgnManager.this.mCurrentRecordSetting.setCoreProvideType("native");
                                            if (MyUtil.isNotNull(SkEgnManager.this.mCurrentRecordSetting.getCoreType())) {
                                                if (SkEgnManager.this.mCurrentRecordSetting.getCoreType().equals(MzwEyWCkjXL.qqmOEnrqrKf)) {
                                                    SkEgnManager.this.mCurrentRecordSetting.setCoreType(CoreType.EN_WORD_EVAL);
                                                }
                                                if (SkEgnManager.this.mCurrentRecordSetting.getCoreType().equals(CoreType.SENT_EVAL_PRO)) {
                                                    SkEgnManager.this.mCurrentRecordSetting.setCoreType(CoreType.EN_SENT_EVAL);
                                                }
                                            }
                                        }
                                        SkEgnManager.access$408(SkEgnManager.this);
                                        SkEgnManager.this.resultBuffer = strTrim;
                                        SkEgnManager.this.mCurrentRecordSetting.setAutoRetry(false);
                                        SkEgnManager.this.mCurrentRecordSetting.setForceRecord(false);
                                        SkEgnManager.this.mCurrentRecordSetting.setNeedSoundIntensity(false);
                                        SkEgnManager skEgnManager = SkEgnManager.this;
                                        skEgnManager.existsAudioTrans(skEgnManager.mCurrentRecordSetting);
                                        return 0;
                                    }
                                }
                            } catch (Exception e12) {
                                MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                                e12.printStackTrace();
                                MyLog.e(SkEgnManager.TAG, strTrim);
                            }
                            try {
                                if (new JSONObject(strTrim).has("error")) {
                                    new Thread() { // from class: com.stkouyu.SkEgnManager.1.1
                                        @Override // java.lang.Thread, java.lang.Runnable
                                        public void run() {
                                            try {
                                                Thread.sleep(10L);
                                            } catch (Exception e13) {
                                                MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                                                e13.printStackTrace();
                                            }
                                            SkEgnManager.this.stopRecord();
                                        }
                                    }.start();
                                    LogCat.pushLog(SkEgnManager.this.mContext);
                                }
                                MyLog.e(SkEgnManager.TAG, "===>callback result:".concat(strTrim));
                                SkEgnManager.this.isAudioFileEval = false;
                                SkEgnManager.this.isAudioFileEvalFirst = false;
                                message.what = 7;
                                message.obj = strTrim;
                                SkEgnManager.this.mHandler.sendMessage(message);
                            } catch (Exception e13) {
                                MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                                e13.printStackTrace();
                            }
                        } else {
                            SkEgnManager skEgnManager2 = SkEgnManager.this;
                            if (skEgnManager2.status1 == engine_status.STOP || skEgnManager2.isAudioFileEval) {
                                jSONObject = new JSONObject(strTrim);
                                if (jSONObject.getInt("eof") == 1) {
                                    SkEgnManager.this.isStopFeed = true;
                                    SkEgnManager.this.cancelRecordTimer();
                                }
                                if (SkEgnManager.this.mCurrentRecordSetting != null) {
                                    string = jSONObject.getString("errId");
                                    if (SkEgnManager.this.autoRetryErrIds.contains(string)) {
                                        SkEgnManager.this.cancel();
                                        SkEgnManager.this.isRetrying = true;
                                        MyLog.e(SkEgnManager.TAG, "===>autoRetry:".concat(strTrim));
                                        MyLog.e(SkEgnManager.TAG, "===>" + string + ",auto retry");
                                        if (SkEgnManager.this.mCurrentEngine.equals("multi")) {
                                            MyLog.e(SkEgnManager.TAG, "===>auto retry,change to native");
                                            SkEgnManager.this.mCurrentRecordSetting.setCoreProvideType("native");
                                            if (MyUtil.isNotNull(SkEgnManager.this.mCurrentRecordSetting.getCoreType())) {
                                                if (SkEgnManager.this.mCurrentRecordSetting.getCoreType().equals(MzwEyWCkjXL.qqmOEnrqrKf)) {
                                                    SkEgnManager.this.mCurrentRecordSetting.setCoreType(CoreType.EN_WORD_EVAL);
                                                }
                                                if (SkEgnManager.this.mCurrentRecordSetting.getCoreType().equals(CoreType.SENT_EVAL_PRO)) {
                                                    SkEgnManager.this.mCurrentRecordSetting.setCoreType(CoreType.EN_SENT_EVAL);
                                                }
                                            }
                                        }
                                        SkEgnManager.access$408(SkEgnManager.this);
                                        SkEgnManager.this.resultBuffer = strTrim;
                                        SkEgnManager.this.mCurrentRecordSetting.setAutoRetry(false);
                                        SkEgnManager.this.mCurrentRecordSetting.setForceRecord(false);
                                        SkEgnManager.this.mCurrentRecordSetting.setNeedSoundIntensity(false);
                                        SkEgnManager skEgnManager3 = SkEgnManager.this;
                                        skEgnManager3.existsAudioTrans(skEgnManager3.mCurrentRecordSetting);
                                        return 0;
                                    }
                                }
                                if (new JSONObject(strTrim).has("error")) {
                                    new Thread() { // from class: com.stkouyu.SkEgnManager.1.1
                                        @Override // java.lang.Thread, java.lang.Runnable
                                        public void run() {
                                            try {
                                                Thread.sleep(10L);
                                            } catch (Exception e14) {
                                                MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                                                e14.printStackTrace();
                                            }
                                            SkEgnManager.this.stopRecord();
                                        }
                                    }.start();
                                    LogCat.pushLog(SkEgnManager.this.mContext);
                                }
                                MyLog.e(SkEgnManager.TAG, "===>callback result:".concat(strTrim));
                                SkEgnManager.this.isAudioFileEval = false;
                                SkEgnManager.this.isAudioFileEvalFirst = false;
                                message.what = 7;
                                message.obj = strTrim;
                                SkEgnManager.this.mHandler.sendMessage(message);
                            } else {
                                MyLog.e(SkEgnManager.TAG, "===>cache result:".concat(strTrim));
                                SkEgnManager.this.resultBuffer = strTrim;
                            }
                        }
                    }
                }
                return 0;
            }
        };
    }

    private void pauseRecordTimer() {
        CountDownTimer countDownTimer = this.mRecordTimer;
        if (countDownTimer != null) {
            countDownTimer.stop();
        }
    }

    private void saveProvision(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", str);
            jSONObject.put("secretKey", str2);
        } catch (Exception e8) {
            MyLog.e(TAG, "===>ST Exception");
            e8.printStackTrace();
        }
        MyLog.e(TAG, "result===>" + MyUtil.getSerialNumber(this.mContext, jSONObject.toString()));
        try {
            JSONObject jSONObject2 = new JSONObject(MyUtil.getSerialNumber(this.mContext, jSONObject.toString()));
            this.mSerialNumber = jSONObject2.getString("serialNumber");
            String string = jSONObject2.getString("provision");
            this.mContext.getSharedPreferences(TAG, 0).edit().putString("serialNumber", this.mSerialNumber).commit();
            this.provisionFile = new File(this.mContext.getExternalFilesDir(null), AppConfig.PROVISION);
            try {
                byte[] bArrDecode = Base64.decode(string.getBytes(), 0);
                FileOutputStream fileOutputStream = new FileOutputStream(this.provisionFile);
                fileOutputStream.write(bArrDecode);
                fileOutputStream.close();
            } catch (Exception e10) {
                MyLog.e(TAG, "===>ST Exception");
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            MyLog.e(TAG, "===>ST Exception");
            MyLog.e(TAG, "result===>" + MyUtil.getSerialNumber(this.mContext, jSONObject.toString()));
            e11.printStackTrace();
        }
    }

    private void startNetworkTask() {
        if (this.mNetworkTask == null) {
            this.mNetworkTask = new NetworkTask();
            this.mNetworkTask.executeOnExecutor(new ThreadPoolExecutor(60, 80, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(80)), new String[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRecordTimer(final int i11, final int i12) {
        destoryRecordTimer();
        HandlerUtils.getInstance().getUIHandler().post(new Runnable() { // from class: com.stkouyu.SkEgnManager.6
            @Override // java.lang.Runnable
            public void run() {
                SkEgnManager.this.mRecordTimer = new CountDownTimer(i11, i12) { // from class: com.stkouyu.SkEgnManager.6.1
                    @Override // com.stkouyu.util.CountDownTimer
                    public void onFinish(long j11) {
                        try {
                            Message message = new Message();
                            message.what = 12;
                            Bundle bundle = new Bundle();
                            bundle.putLong("millisUntilFinished", 0L);
                            bundle.putDouble("percentUntilFinished", 100.0d);
                            message.setData(bundle);
                            SkEgnManager.this.mHandler.sendMessage(message);
                        } catch (Exception e8) {
                            MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                            e8.printStackTrace();
                        }
                        engine_status engine_statusVar = SkEgnManager.this.status1;
                        if (engine_statusVar == engine_status.RECORDING || engine_statusVar == engine_status.PAUSED) {
                            MyLog.e(SkEgnManager.TAG, "timer stop record");
                            SkEgnManager.this.stopRecord();
                        }
                    }

                    @Override // com.stkouyu.util.CountDownTimer
                    public void onTick(long j11) {
                        Message message = new Message();
                        try {
                            message.what = 12;
                            Bundle bundle = new Bundle();
                            bundle.putLong("millisUntilFinished", ((long) i11) - j11);
                            bundle.putDouble("percentUntilFinished", (j11 * 100.0d) / ((double) i11));
                            message.setData(bundle);
                            SkEgnManager.this.mHandler.sendMessage(message);
                        } catch (Exception e8) {
                            MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                            e8.printStackTrace();
                        }
                    }
                };
                SkEgnManager.this.mRecordTimer.start();
            }
        });
    }

    private void startTimedPushlogTimer() {
        try {
            MyLog.e(TAG, "===>startTimedPushlogTimer");
            if (this.TimedPushlogtimer != null) {
                return;
            }
            this.TimedPushlogtimer = new Timer();
            this.TimedPushlogtimer.schedule(new TimerTask() { // from class: com.stkouyu.SkEgnManager.8
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    LogCat.pushLog(SkEgnManager.this.mContext);
                }
            }, 180000L, 180000L);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNetworkTask() {
        NetworkTask networkTask = this.mNetworkTask;
        if (networkTask != null) {
            networkTask.cancel(true);
            this.mNetworkTask = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopTimedPushlogTimer() {
        try {
            MyLog.e(TAG, "===>stopTimedPushlogTimer");
            Timer timer = this.TimedPushlogtimer;
            if (timer != null) {
                timer.cancel();
                this.TimedPushlogtimer = null;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public boolean activeMic() {
        MyLog.e(TAG, "===>activeMic");
        if (this.recorder == null) {
            return true;
        }
        MyLog.e(TAG, "start active mic");
        boolean zActiveRecorder = this.recorder.activeRecorder();
        MyLog.e(TAG, "active mic ".concat(zActiveRecorder ? "success" : "false"));
        return zActiveRecorder;
    }

    public void cancel() {
        try {
            try {
                this.isStopFeed = true;
                engine_status engine_statusVar = engine_status.STOP;
                this.status1 = engine_statusVar;
                MyLog.e(TAG, "===>cancel record");
                this.isRecordCancel = true;
                STRecorderExternal sTRecorderExternal = this.recorderExternal;
                if (sTRecorderExternal != null) {
                    sTRecorderExternal.stop();
                }
                STRecorder sTRecorder = this.recorder;
                if (sTRecorder != null && this.engine != 0) {
                    sTRecorder.cancel();
                }
                cancelRecordTimer();
                this.status1 = engine_statusVar;
                MyLog.e(TAG, " skegn_cancel ");
                SkEgn.skegn_cancel(this.engine);
                this.status1 = engine_statusVar;
            } catch (Exception e8) {
                MyLog.e(TAG, "===>ST Exception");
                e8.printStackTrace();
                this.status1 = engine_status.STOP;
            }
        } catch (Throwable th2) {
            this.status1 = engine_status.STOP;
            throw th2;
        }
    }

    public void cancle() {
        cancel();
    }

    public void clearActivityListener() {
        this.mOnRecordBufferListener = null;
        this.mOnPlayerListener = null;
        this.mOnRecordListener = null;
        this.mOnRecorderListener = null;
        this.mOnNetworkListener = null;
    }

    public void clearInitListener() {
        EngineSetting engineSetting = this.mCurrentEngineSetting;
        if (engineSetting != null) {
            engineSetting.setOnInitEngineListener(null);
        }
        this.mOnInitEngineListener = null;
        this.mOnNetworkListener = null;
    }

    public void feed(byte[] bArr) {
        STRecorderExternal sTRecorderExternal = this.recorderExternal;
        if (sTRecorderExternal == null || this.status1 != engine_status.RECORDING || this.isAudioFileEval || bArr.length <= 0) {
            return;
        }
        try {
            sTRecorderExternal.feed(bArr, bArr.length);
            SkEgn.skegn_feed(this.engine, bArr, bArr.length);
        } catch (Exception e8) {
            MyLog.e(TAG, "exception", e8);
        }
    }

    public String getCurrentEngineType() {
        return this.mCurrentEngine;
    }

    public engine_status getEngineStatus() {
        MyLog.e(TAG, "getEngineStatus");
        return this.status1;
    }

    public String getLastRecordPath() {
        return MyUtil.isNotNull(this.mp3Path) ? this.mp3Path : this.recordedPath;
    }

    public boolean getRecorderOccupied() {
        return STRecorder.getRecorderOccupied(getContext());
    }

    public void initCloudEngine(String str, String str2, String str3) {
        initCloudEngine(str, str2, str3, null);
    }

    public void initEngine(String str, String str2, String str3, EngineSetting engineSetting) {
        synchronized (this) {
            try {
                if (this.isInitializing) {
                    MyLog.e(TAG, "Initialization in progress, ignoring duplicate calls");
                    return;
                }
                this.isInitializing = true;
                LogCat.initLogCat(this.mContext, str, str3);
                startTimedPushlogTimer();
                MyLog.e(TAG, "===>initEngine");
                if (checkAppKeyAndSecretKey(str, str2)) {
                    MyLog.e(TAG, "mHandler===>" + this.mHandler);
                    try {
                        if (engineSetting == null) {
                            initCloudEngine(str, str2, str3);
                        } else {
                            this.mCurrentEngineSetting = engineSetting;
                            try {
                                if (this.mCurrentEngine != null) {
                                    MyLog.e(TAG, "delete exists engine:" + this.mCurrentEngine + ",engine:" + this.engine);
                                    SkEgn.skegn_delete(this.engine);
                                    this.engine = 0L;
                                    this.status1 = engine_status.STOP;
                                    this.mCurrentEngine = null;
                                }
                                cancelRecordTimer();
                                this.mCurrentEngineSetting.setUserId(str3);
                                this.mOnInitEngineListener = this.mCurrentEngineSetting.getOnInitEngineListener();
                                this.mHandler.sendEmptyMessage(1);
                                if (MyUtil.isNull(this.mCurrentEngineSetting.getEngineType())) {
                                    MyLog.e(TAG, "初始化引擎失败,未指定引擎类型");
                                    Message message = new Message();
                                    message.what = 3;
                                    message.obj = "missing engineType";
                                    this.mHandler.sendMessage(message);
                                    LogCat.pushLog(this.mContext);
                                    this.isInitializing = false;
                                    return;
                                }
                                String strConfigInitEngineParam = configInitEngineParam(str, str2, this.mCurrentEngineSetting);
                                if (MyUtil.isNull(strConfigInitEngineParam)) {
                                    MyLog.e(TAG, "初始化引擎失败");
                                    Message message2 = new Message();
                                    message2.what = 3;
                                    message2.obj = "config init param failed";
                                    this.mHandler.sendMessage(message2);
                                    LogCat.pushLog(this.mContext);
                                    this.isInitializing = false;
                                    return;
                                }
                                MyLog.e(TAG, "初始化参数cfg===>" + strConfigInitEngineParam.replace(str2, "xxx"));
                                this.mCurrentEngine = this.mCurrentEngineSetting.getEngineType();
                                if (SkEgn.isLibraryLoaded()) {
                                    this.engine = SkEgn.skegn_new(strConfigInitEngineParam, getContext());
                                    MyLog.e(TAG, "engine:" + String.valueOf(this.engine));
                                    if (this.engine != 0) {
                                        MyLog.e(TAG, "初始化引擎成功");
                                        this.mHandler.sendEmptyMessage(2);
                                    } else {
                                        MyLog.e(TAG, "初始化引擎失败");
                                        int iSkegn_get_last_error = SkEgn.skegn_get_last_error();
                                        Message message3 = new Message();
                                        message3.what = 3;
                                        message3.obj = "error:" + String.valueOf(iSkegn_get_last_error);
                                        this.mHandler.sendMessage(message3);
                                        LogCat.pushLog(this.mContext);
                                    }
                                } else {
                                    MyLog.e(TAG, "初始化引擎失败");
                                    Message message4 = new Message();
                                    message4.what = 3;
                                    message4.obj = "error: so库加载失败";
                                    this.mHandler.sendMessage(message4);
                                    LogCat.pushLog(this.mContext);
                                }
                            } catch (Exception e8) {
                                MyLog.e(TAG, "初始化引擎失败");
                                Message message5 = new Message();
                                message5.what = 3;
                                message5.obj = e8.getMessage();
                                this.mHandler.sendMessage(message5);
                                e8.printStackTrace();
                                LogCat.pushLog(this.mContext);
                            }
                        }
                    } catch (Exception e10) {
                        MyLog.e(TAG, "初始化引擎失败");
                        Message message6 = new Message();
                        message6.what = 3;
                        message6.obj = e10.getMessage();
                        this.mHandler.sendMessage(message6);
                        e10.printStackTrace();
                        LogCat.pushLog(this.mContext);
                    }
                }
                this.isInitializing = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void initNativeEngine(String str, String str2, String str3) {
        initNativeEngine(str, str2, str3, null);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0110 A[PHI: r17
      0x0110: PHI (r17v8 java.lang.String) = 
      (r17v7 java.lang.String)
      (r17v7 java.lang.String)
      (r17v7 java.lang.String)
      (r17v10 java.lang.String)
      (r17v10 java.lang.String)
      (r17v10 java.lang.String)
     binds: [B:47:0x012e, B:49:0x0138, B:51:0x013c, B:32:0x00d8, B:34:0x00e2, B:36:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    public void initParams(RecordSetting recordSetting) {
        String str;
        JSONObject jSONObject;
        String str2 = "===>ST Exception";
        this.params = new JSONObject();
        if (recordSetting.getCoreType() == null && recordSetting.getRequest() != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(recordSetting.getRequest());
                if (jSONObject2.has("coreType")) {
                    recordSetting.setCoreType(jSONObject2.getString("coreType"));
                    this.mCurrentRecordSetting.setCoreType(jSONObject2.getString("coreType"));
                }
            } catch (Exception unused) {
            }
        }
        if (recordSetting.getCoreType() == null || BuildConfig.VERSION_NAME.equals(recordSetting.getCoreType())) {
            MyLog.e(TAG, "coreType is required!");
            return;
        }
        try {
            try {
                try {
                    MyLog.e(TAG, "coreProvideType:" + recordSetting.getCoreProvideType() + ",CurrentEngine:" + this.mCurrentEngine);
                    String str3 = this.mCurrentEngine;
                    try {
                        if (!MyUtil.isNotNull(str3) || !this.mCurrentEngine.equals("multi")) {
                            str = "===>ST Exception";
                        } else if (MyUtil.isNotNull(recordSetting.getCoreProvideType())) {
                            str = "===>ST Exception";
                            if (recordSetting.getCoreProvideType().equals("native")) {
                                MyLog.e(TAG, "===>init params native");
                            } else {
                                MyLog.e(TAG, "network status:" + this.networkStatus);
                                if (recordSetting.getCoreType().equals(CoreType.CN_WORD_EVAL) || recordSetting.getCoreType().equals(CoreType.CN_SENT_EVAL) || this.networkStatus) {
                                    str3 = "cloud";
                                } else {
                                    MyLog.e(TAG, "===>init params:network disconnected change to native");
                                    if (MyUtil.isNotNull(recordSetting.getCoreType())) {
                                        if (recordSetting.getCoreType().equals(CoreType.WORD_EVAL_PRO)) {
                                            recordSetting.setCoreType(CoreType.EN_WORD_EVAL);
                                        }
                                        if (recordSetting.getCoreType().equals(CoreType.SENT_EVAL_PRO)) {
                                            recordSetting.setCoreType(CoreType.EN_SENT_EVAL);
                                        }
                                    }
                                }
                            }
                            str3 = "native";
                        } else {
                            str = "===>ST Exception";
                            MyLog.e(TAG, "network status:" + this.networkStatus);
                            if (recordSetting.getCoreType().equals(CoreType.CN_WORD_EVAL) || recordSetting.getCoreType().equals(CoreType.CN_SENT_EVAL) || this.networkStatus) {
                                str3 = "cloud";
                            } else {
                                MyLog.e(TAG, "===>init params:network disconnected change to native");
                                if (MyUtil.isNotNull(recordSetting.getCoreType())) {
                                    if (recordSetting.getCoreType().equals(CoreType.WORD_EVAL_PRO)) {
                                        recordSetting.setCoreType(CoreType.EN_WORD_EVAL);
                                    }
                                    if (recordSetting.getCoreType().equals(CoreType.SENT_EVAL_PRO)) {
                                        recordSetting.setCoreType(CoreType.EN_SENT_EVAL);
                                    }
                                }
                                str3 = "native";
                            }
                        }
                        if (MyUtil.isNotNull(str3)) {
                            this.mCurrentRecordSetting.setCoreProvideType(str3);
                            this.params.put("coreProvideType", str3);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        String userId = recordSetting.getUserId();
                        if (MyUtil.isNull(userId) || userId.equals("userId")) {
                            EngineSetting engineSetting = this.mCurrentEngineSetting;
                            userId = engineSetting != null ? engineSetting.getUserId() : null;
                            if (MyUtil.isNull(userId)) {
                                userId = "userId";
                            }
                        }
                        jSONObject3.put("userId", userId);
                        this.params.put("app", jSONObject3);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("audioType", recordSetting.getAudioType());
                        jSONObject4.put("sampleRate", recordSetting.getSampleRate());
                        jSONObject4.put("channel", recordSetting.getChannel());
                        jSONObject4.put("sampleBytes", 2);
                        jSONObject4.put("compress", recordSetting.getCompress());
                        if (recordSetting.getRealtime_feedback() != null && recordSetting.getRealtime_feedback().intValue() == 1) {
                            jSONObject4.put("max_ogg_delay", 9600);
                        }
                        if (recordSetting.getMax_ogg_delay() != null) {
                            jSONObject4.put("max_ogg_delay", recordSetting.getMax_ogg_delay());
                        }
                        this.params.put("audio", jSONObject4);
                        if (recordSetting.getRequest() != null) {
                            jSONObject = new JSONObject(recordSetting.getRequest());
                            jSONObject.put("coreType", recordSetting.getCoreType());
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("coreType", recordSetting.getCoreType());
                            jSONObject.put("qType", recordSetting.getqType());
                            jSONObject.put("keywords", recordSetting.getKeywords());
                            if (MyUtil.isNotNull(recordSetting.getRefAudio())) {
                                jSONObject.put("refAudio", recordSetting.getRefAudio());
                            }
                            if (MyUtil.isNotNull(recordSetting.getRefText())) {
                                jSONObject.put("refText", recordSetting.getRefText());
                            }
                            if (recordSetting.getRealtime_feedback() != null) {
                                jSONObject.put("realtime_feedback", recordSetting.getRealtime_feedback());
                            }
                            jSONObject.put("getParam", recordSetting.isNeedRequestParamsInResult() ? 1 : 0);
                            jSONObject.put("paragraph_need_word_score", recordSetting.isNeedWordScoreInParagraph() ? 1 : 0);
                            jSONObject.put("attachAudioUrl", recordSetting.isNeedAttachAudioUrlInResult() ? 1 : 0);
                            jSONObject.put("phoneme_output", recordSetting.isNeedPhonemeOutputInWord() ? 1 : 0);
                            jSONObject.put("dict_type", recordSetting.getDict_type());
                            jSONObject.put("scale", recordSetting.getScale());
                            jSONObject.put("precision", recordSetting.getPrecision());
                            jSONObject.put("slack", recordSetting.getSlack());
                            jSONObject.put("agegroup", recordSetting.getAgegroup());
                            jSONObject.put("blend_phoneme", recordSetting.getBlendPhonemeEnable() ? 1 : 0);
                            if (MyUtil.isNotNull(recordSetting.getCustomized_lexicon())) {
                                jSONObject.put("customized_lexicon", new JSONObject(recordSetting.getCustomized_lexicon()));
                            }
                            if (MyUtil.isNotNull(recordSetting.getCustomized_pron())) {
                                jSONObject.put("customized_pron", new JSONObject(recordSetting.getCustomized_pron()));
                            }
                            if (MyUtil.isNotNull(recordSetting.getNegativeReftext())) {
                                jSONObject.put("negativeReftext", recordSetting.getNegativeReftext());
                            }
                            if (MyUtil.isNotNull(recordSetting.getDict_dialect())) {
                                jSONObject.put("dict_dialect", recordSetting.getDict_dialect());
                            }
                            if (recordSetting.getDetect_nonscorable() != null) {
                                jSONObject.put("detect_nonscorable", recordSetting.getDetect_nonscorable());
                            }
                            if (recordSetting.getOutput_rawtext() != null) {
                                jSONObject.put("output_rawtext", recordSetting.getOutput_rawtext());
                            }
                            if (MyUtil.isNotNull(recordSetting.getKeypoints()) && !recordSetting.getKeypoints().isEmpty()) {
                                jSONObject.put("keypoints", new JSONArray(recordSetting.getKeypoints()));
                            }
                            if (recordSetting.getKeypoints_weight() != null) {
                                jSONObject.put("keypoints_weight", recordSetting.getKeypoints_weight());
                            }
                            if (MyUtil.isNotNull(recordSetting.getNegative_keypoints()) && !recordSetting.getNegative_keypoints().isEmpty()) {
                                jSONObject.put("negative_keypoints", new JSONArray(recordSetting.getNegative_keypoints()));
                            }
                            if (recordSetting.getServerTimeout() != null) {
                                jSONObject.put("serverTimeout", recordSetting.getServerTimeout());
                            }
                            if (MyUtil.isNotNull(recordSetting.getMode())) {
                                jSONObject.put("mode", recordSetting.getMode());
                            }
                            if (MyUtil.isNotNull(recordSetting.getRefPinyin())) {
                                jSONObject.put("refPinyin", recordSetting.getRefPinyin());
                            }
                            if (recordSetting.getVad_detction() != null) {
                                jSONObject.put("vad_detection", recordSetting.getVad_detction());
                            }
                            if (recordSetting.getPunctuate() != null) {
                                jSONObject.put("punctuate", recordSetting.getPunctuate());
                            }
                            if (recordSetting.getReadtypeDiagnosis() != null) {
                                jSONObject.put("readtype_diagnosis", recordSetting.getReadtypeDiagnosis());
                            }
                            if (recordSetting.getItn() != null) {
                                jSONObject.put("itn", recordSetting.getItn());
                            }
                            if (recordSetting.getNewParams() != null && recordSetting.getNewParams().size() > 0) {
                                int size = recordSetting.getNewParams().size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    CustomParam customParam = recordSetting.getNewParams().get(i11);
                                    jSONObject.put(customParam.getKey(), customParam.getValue());
                                }
                            }
                        }
                        this.params.put("request", jSONObject);
                        if ("native".equals(this.mCurrentEngine)) {
                            this.params.put("serialNumber", this.mContext.getSharedPreferences(TAG, 0).getString("serialNumber", BuildConfig.VERSION_NAME));
                        }
                        this.params.put("soundIntensityEnable", recordSetting.isNeedSoundIntensity() ? 1 : 0);
                        this.params.put("networkDiagnosis", recordSetting.isNetworkDiagnosis() ? 1 : 0);
                        this.params.put("protocol", recordSetting.getProtocol());
                        if (recordSetting.getSeek() != null || recordSetting.getRef_length() != null) {
                            JSONObject jSONObject5 = new JSONObject();
                            if (recordSetting.getSeek() != null) {
                                jSONObject5.put("seek", recordSetting.getSeek());
                            }
                            if (recordSetting.getRef_length() != null) {
                                jSONObject5.put("ref_length", recordSetting.getRef_length());
                            }
                            this.params.put("vad", jSONObject5);
                        }
                        if (MyUtil.isNotNull(recordSetting.getCustomized_sig_url())) {
                            this.params.put("customized_sig_url", recordSetting.getCustomized_sig_url());
                        }
                        if (MyUtil.isNotNull(recordSetting.getCustomized_sig())) {
                            this.params.put("customized_sig", new JSONObject(recordSetting.getCustomized_sig()));
                        }
                    } catch (JSONException e8) {
                        e = e8;
                        str2 = str;
                        MyLog.e(TAG, str2);
                        e.printStackTrace();
                    } catch (Exception e10) {
                        e = e10;
                        str2 = str;
                        MyLog.e(TAG, str2);
                        e.printStackTrace();
                    }
                } catch (JSONException e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (JSONException e13) {
            e = e13;
        }
        MyLog.e(TAG, "上传参数params===>" + this.params.toString());
    }

    public String inquireOov(RecordSetting recordSetting) {
        new JSONObject();
        try {
            if (MyUtil.isNull(this.mCurrentEngine) || this.engine == 0) {
                MyLog.e(TAG, "inquireOov failed,engineType is null");
                return "{\"error\":\"Incorrect engine parameters\"}";
            }
            if (recordSetting == null) {
                MyLog.e(TAG, "RecordSetting instance is required!");
                return "{\"error\":\"Invalid argument\"}";
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (recordSetting.getRequest() != null) {
                    jSONObject = new JSONObject(recordSetting.getRequest());
                } else {
                    if (!MyUtil.isNotNull(recordSetting.getRefText())) {
                        MyLog.e(TAG, "Request or refText is required!");
                        return "{\"error\":\"Invalid argument without request or refText\"}";
                    }
                    jSONObject.put("refText", recordSetting.getRefText());
                }
                jSONObject2.put("request", jSONObject);
                MyLog.d(TAG, "InquireOov param is:" + jSONObject2.toString());
                String strSkegn_inquire_oov = SkEgn.skegn_inquire_oov(this.engine, jSONObject2.toString());
                return MyUtil.isNotNull(strSkegn_inquire_oov) ? strSkegn_inquire_oov : "{\"error\":\"Unknown failure\"}";
            } catch (JSONException e8) {
                MyLog.e(TAG, "JSON parse error: " + e8.getMessage());
                return "{\"error\":\"Invalid JSON format\"}";
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            LogCat.pushLog(this.mContext);
            return "{\"error\":\"Unknown failure\"}";
        }
    }

    public boolean inquireProvision(String str, final InquireProvisionCallback inquireProvisionCallback) {
        MyLog.e(TAG, "===>inquireProvision");
        if (str == null || str.isEmpty()) {
            MyLog.e(TAG, "provision_path is empty ,i will use default path.");
        }
        return SkEgn.skegn_inquire_provision(str, new SkEgn.skegn_callback() { // from class: com.stkouyu.SkEgnManager.7
            @Override // com.stkouyu.SkEgn.skegn_callback
            public int run(byte[] bArr, int i11, byte[] bArr2, int i12) {
                InquireProvisionCallback inquireProvisionCallback2 = inquireProvisionCallback;
                if (inquireProvisionCallback2 != null) {
                    inquireProvisionCallback2.run(new String(bArr2).trim());
                }
                MyLog.e(SkEgnManager.TAG, "message is: " + new String(bArr2).trim() + " .");
                return 0;
            }
        }, this.mContext) == 0;
    }

    public void pauseRecord() {
        MyLog.e(TAG, "===>pauseRecord");
        if (this.status1 == engine_status.RECORDING) {
            this.status1 = engine_status.PAUSED;
        }
        STRecorder sTRecorder = this.recorder;
        if (sTRecorder != null) {
            sTRecorder.pause();
        }
        Message message = new Message();
        message.what = 13;
        this.mHandler.sendMessage(message);
    }

    public void playWithPath(String str) {
        MyLog.e(TAG, "===>playWithPath");
        STRecorder sTRecorder = this.recorder;
        if (sTRecorder != null) {
            sTRecorder.playWithPath(str, this.mHandler);
            return;
        }
        Message message = new Message();
        message.what = 16;
        message.obj = "recording is required before playing";
        this.mHandler.sendMessage(message);
        LogCat.pushLog(this.mContext);
    }

    public void recycle() {
        new Thread() { // from class: com.stkouyu.SkEgnManager.5
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                MyLog.e(SkEgnManager.TAG, "recycle start===>" + jCurrentTimeMillis);
                SkEgnManager.this.mCurrentEngine = null;
                SkEgnManager.this.provisionFile = null;
                SkEgnManager.this.isStopFeed = true;
                try {
                    SkEgnManager.this.stopNetworkTask();
                    if (SkEgnManager.this.engine != 0) {
                        MyLog.e(SkEgnManager.TAG, PQgum.QEahotLgtvCQvtD);
                        SkEgn.skegn_delete(SkEgnManager.this.engine);
                        MyLog.e(SkEgnManager.TAG, "end delete");
                        SkEgnManager skEgnManager = SkEgnManager.this;
                        skEgnManager.engine = 0L;
                        skEgnManager.status1 = engine_status.STOP;
                    }
                    if (SkEgnManager.this.recorder != null) {
                        MyLog.e(SkEgnManager.TAG, "start to stop record");
                        SkEgnManager.this.recorder.stop();
                        SkEgnManager.this.recorder.delete();
                        SkEgnManager.this.recorder = null;
                        MyLog.e(SkEgnManager.TAG, "stop record success");
                    }
                } catch (Exception e8) {
                    MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                    e8.printStackTrace();
                }
                try {
                    SkEgnManager.this.destoryRecordTimer();
                } catch (Exception e10) {
                    MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                    e10.printStackTrace();
                }
                SkEgnManager.this.clearActivityListener();
                SkEgnManager.this.clearInitListener();
                MyLog.e(SkEgnManager.TAG, "recycle duration===>" + (System.currentTimeMillis() - jCurrentTimeMillis));
                SkEgnManager.this.stopTimedPushlogTimer();
                LogCat.destorytLogCat();
            }
        }.run();
    }

    public boolean releaseMic() {
        MyLog.e(TAG, "===>releaseMic");
        if (this.recorder == null) {
            return true;
        }
        MyLog.e(TAG, "start release mic");
        this.recorder.stop();
        boolean zReleaseRecorder = this.recorder.releaseRecorder();
        MyLog.e(TAG, "release mic".concat(zReleaseRecorder ? "success" : "false"));
        return zReleaseRecorder;
    }

    public void restartRecord() {
        STRecorder sTRecorder;
        MyLog.e(TAG, "===>restartRecord");
        if (MyUtil.isNotNull(this.recordedPath) && (sTRecorder = this.recorder) != null) {
            sTRecorder.restart();
        }
        if (this.status1 == engine_status.PAUSED) {
            this.status1 = engine_status.RECORDING;
        }
        Message message = new Message();
        message.what = 10;
        this.mHandler.sendMessage(message);
    }

    public void setNetworkListener(OnNetworkListener onNetworkListener) {
        this.mOnNetworkListener = onNetworkListener;
    }

    public void setOnRecordBufferListener(OnRecordBufferListener onRecordBufferListener) {
        this.mOnRecordBufferListener = onRecordBufferListener;
    }

    public void setOnRecorderListener(OnRecorderListener onRecorderListener) {
        this.mOnRecorderListener = onRecorderListener;
    }

    public void setPlayerListener(OnPlayerListener onPlayerListener) {
        this.mOnPlayerListener = onPlayerListener;
    }

    public void startRecord(String str, String str2, int i11, OnRecorderListener onRecorderListener) {
        RecordSetting recordSetting = new RecordSetting(str, i11);
        recordSetting.setRefText(str2);
        startRecord(recordSetting, onRecorderListener);
    }

    public void stopPlay() {
        MyLog.e(TAG, "===>stopPlay");
        STRecorder sTRecorder = this.recorder;
        if (sTRecorder != null) {
            sTRecorder.stopPlay();
        }
    }

    public void stopRecord() {
        try {
            try {
                MyLog.e(TAG, "===>stop record");
                this.isStopFeed = true;
                STRecorderExternal sTRecorderExternal = this.recorderExternal;
                if (sTRecorderExternal != null) {
                    sTRecorderExternal.stop();
                }
                STRecorder sTRecorder = this.recorder;
                if (sTRecorder != null) {
                    sTRecorder.stop();
                }
                cancelRecordTimer();
                if (this.evalCount == 0 && this.status1 != engine_status.STOP && !this.isRecordCancel) {
                    try {
                        Message message = new Message();
                        message.what = 14;
                        this.mHandler.sendMessage(message);
                    } catch (Exception e8) {
                        MyLog.e(TAG, "===>ST Exception");
                        e8.printStackTrace();
                    }
                }
                MyLog.e(TAG, "===>isRecordCancel:" + this.isRecordCancel);
                engine_status engine_statusVar = this.status1;
                engine_status engine_statusVar2 = engine_status.STOP;
                if (engine_statusVar != engine_statusVar2 && !this.isRecordCancel) {
                    this.status1 = engine_statusVar2;
                    MyLog.e(TAG, " skegn_stop ");
                    SkEgn.skegn_stop(this.engine);
                }
                this.status1 = engine_statusVar2;
            } catch (Exception e10) {
                MyLog.e(TAG, "===>ST Exception");
                e10.printStackTrace();
                this.status1 = engine_status.STOP;
            }
            RecordSetting recordSetting = this.mCurrentRecordSetting;
            if (recordSetting == null || !recordSetting.isForceRecord() || this.isRetrying || !MyUtil.isNotNull(this.resultBuffer)) {
                return;
            }
            try {
                RecordSetting recordSetting2 = this.mCurrentRecordSetting;
                if (recordSetting2 != null && recordSetting2.isAutoRetry() && this.resultBuffer.contains("errId")) {
                    String string = new JSONObject(this.resultBuffer).getString("errId");
                    if (this.autoRetryErrIds.contains(string)) {
                        this.isRetrying = true;
                        MyLog.e(TAG, "===>forcerecord autoRetry:" + this.resultBuffer);
                        MyLog.e(TAG, "===>" + string + ",auto retry");
                        if (this.mCurrentEngine.equals("multi") && this.mCurrentRecordSetting.getCoreProvideType().equals("cloud") && MyUtil.isNotNull(this.mCurrentRecordSetting.getCoreType()) && this.multiEngineRetryCoreTypes.contains(this.mCurrentRecordSetting.getCoreType())) {
                            this.mCurrentRecordSetting.setCoreProvideType("native");
                            if (MyUtil.isNotNull(this.mCurrentRecordSetting.getCoreType())) {
                                if (this.mCurrentRecordSetting.getCoreType().equals(CoreType.WORD_EVAL_PRO)) {
                                    this.mCurrentRecordSetting.setCoreType(CoreType.EN_WORD_EVAL);
                                }
                                if (this.mCurrentRecordSetting.getCoreType().equals(CoreType.SENT_EVAL_PRO)) {
                                    this.mCurrentRecordSetting.setCoreType(CoreType.EN_SENT_EVAL);
                                }
                            }
                        }
                        this.evalCount++;
                        this.mCurrentRecordSetting.setAutoRetry(false);
                        this.mCurrentRecordSetting.setForceRecord(false);
                        this.mCurrentRecordSetting.setNeedSoundIntensity(false);
                        existsAudioTrans(this.mCurrentRecordSetting);
                        LogCat.pushLog(this.mContext);
                        return;
                    }
                }
            } catch (Exception e11) {
                MyLog.e(TAG, "===>ST Exception");
                e11.printStackTrace();
            }
            Message message2 = new Message();
            message2.what = 7;
            message2.obj = this.resultBuffer;
            this.mHandler.sendMessage(message2);
            this.resultBuffer = BuildConfig.VERSION_NAME;
        } catch (Throwable th2) {
            this.status1 = engine_status.STOP;
            throw th2;
        }
    }

    public boolean updateProvision(String str, String str2, String str3) {
        MyLog.e(TAG, "===>updateProvision");
        if (str == null || str.isEmpty()) {
            MyLog.e(TAG, "provision_path is empty ,i will use default path.");
        }
        return SkEgn.skegn_update_provision(str, str2, str3, this.mContext) == 0;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0245 A[Catch: Exception -> 0x025d, TryCatch #2 {Exception -> 0x025d, blocks: (B:102:0x023b, B:104:0x0245, B:106:0x0254, B:109:0x0261), top: B:140:0x023b }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0261 A[Catch: Exception -> 0x025d, TRY_LEAVE, TryCatch #2 {Exception -> 0x025d, blocks: (B:102:0x023b, B:104:0x0245, B:106:0x0254, B:109:0x0261), top: B:140:0x023b }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0272 A[Catch: Exception -> 0x0289, TryCatch #7 {Exception -> 0x0289, blocks: (B:111:0x0268, B:113:0x0272, B:115:0x0281, B:118:0x028b), top: B:147:0x0268 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x028b A[Catch: Exception -> 0x0289, TRY_LEAVE, TryCatch #7 {Exception -> 0x0289, blocks: (B:111:0x0268, B:113:0x0272, B:115:0x0281, B:118:0x028b), top: B:147:0x0268 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x029e A[Catch: Exception -> 0x02b6, TryCatch #11 {Exception -> 0x02b6, blocks: (B:121:0x0294, B:123:0x029e, B:125:0x02ad, B:128:0x02b8), top: B:153:0x0294, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x02b8 A[Catch: Exception -> 0x02b6, TRY_LEAVE, TryCatch #11 {Exception -> 0x02b6, blocks: (B:121:0x0294, B:123:0x029e, B:125:0x02ad, B:128:0x02b8), top: B:153:0x0294, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e4 A[Catch: Exception -> 0x0070, JSONException -> 0x0073, TryCatch #12 {JSONException -> 0x0073, Exception -> 0x0070, blocks: (B:3:0x000d, B:19:0x0079, B:23:0x00a8, B:25:0x00c7, B:27:0x00d1, B:28:0x00de, B:30:0x00e4, B:31:0x00eb, B:74:0x01ab, B:76:0x01b1, B:78:0x01b7, B:71:0x01a4, B:60:0x0171, B:41:0x0116, B:79:0x01bc, B:81:0x01c7, B:83:0x01e4, B:85:0x01ee, B:86:0x01fb, B:88:0x0201, B:89:0x0208, B:134:0x02c9, B:131:0x02c2, B:120:0x0291, B:101:0x0238, B:13:0x006c, B:18:0x0076, B:92:0x020e, B:94:0x0216, B:97:0x021d, B:99:0x0234, B:32:0x00ee, B:34:0x00f6, B:37:0x00fd, B:39:0x0112, B:61:0x0174, B:63:0x017e, B:65:0x018d, B:68:0x019a, B:121:0x0294, B:123:0x029e, B:125:0x02ad, B:128:0x02b8, B:5:0x002d, B:7:0x0033), top: B:154:0x000d, inners: #3, #5, #9, #11, #11 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00f6 A[Catch: Exception -> 0x00fb, TryCatch #5 {Exception -> 0x00fb, blocks: (B:32:0x00ee, B:34:0x00f6, B:37:0x00fd, B:39:0x0112), top: B:144:0x00ee, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0112 A[Catch: Exception -> 0x00fb, TRY_LEAVE, TryCatch #5 {Exception -> 0x00fb, blocks: (B:32:0x00ee, B:34:0x00f6, B:37:0x00fd, B:39:0x0112), top: B:144:0x00ee, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0123 A[Catch: Exception -> 0x013b, TryCatch #4 {Exception -> 0x013b, blocks: (B:42:0x0119, B:44:0x0123, B:46:0x0132, B:49:0x013f), top: B:143:0x0119 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x013f A[Catch: Exception -> 0x013b, TRY_LEAVE, TryCatch #4 {Exception -> 0x013b, blocks: (B:42:0x0119, B:44:0x0123, B:46:0x0132, B:49:0x013f), top: B:143:0x0119 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0150 A[Catch: Exception -> 0x0169, TryCatch #8 {Exception -> 0x0169, blocks: (B:51:0x0146, B:53:0x0150, B:55:0x015f, B:58:0x016b), top: B:150:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x016b A[Catch: Exception -> 0x0169, TRY_LEAVE, TryCatch #8 {Exception -> 0x0169, blocks: (B:51:0x0146, B:53:0x0150, B:55:0x015f, B:58:0x016b), top: B:150:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x017e A[Catch: Exception -> 0x0198, TryCatch #9 {Exception -> 0x0198, blocks: (B:61:0x0174, B:63:0x017e, B:65:0x018d, B:68:0x019a), top: B:152:0x0174, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x019a A[Catch: Exception -> 0x0198, TRY_LEAVE, TryCatch #9 {Exception -> 0x0198, blocks: (B:61:0x0174, B:63:0x017e, B:65:0x018d, B:68:0x019a), top: B:152:0x0174, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b7 A[Catch: Exception -> 0x0070, JSONException -> 0x0073, TryCatch #12 {JSONException -> 0x0073, Exception -> 0x0070, blocks: (B:3:0x000d, B:19:0x0079, B:23:0x00a8, B:25:0x00c7, B:27:0x00d1, B:28:0x00de, B:30:0x00e4, B:31:0x00eb, B:74:0x01ab, B:76:0x01b1, B:78:0x01b7, B:71:0x01a4, B:60:0x0171, B:41:0x0116, B:79:0x01bc, B:81:0x01c7, B:83:0x01e4, B:85:0x01ee, B:86:0x01fb, B:88:0x0201, B:89:0x0208, B:134:0x02c9, B:131:0x02c2, B:120:0x0291, B:101:0x0238, B:13:0x006c, B:18:0x0076, B:92:0x020e, B:94:0x0216, B:97:0x021d, B:99:0x0234, B:32:0x00ee, B:34:0x00f6, B:37:0x00fd, B:39:0x0112, B:61:0x0174, B:63:0x017e, B:65:0x018d, B:68:0x019a, B:121:0x0294, B:123:0x029e, B:125:0x02ad, B:128:0x02b8, B:5:0x002d, B:7:0x0033), top: B:154:0x000d, inners: #3, #5, #9, #11, #11 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01bc A[Catch: Exception -> 0x0070, JSONException -> 0x0073, TryCatch #12 {JSONException -> 0x0073, Exception -> 0x0070, blocks: (B:3:0x000d, B:19:0x0079, B:23:0x00a8, B:25:0x00c7, B:27:0x00d1, B:28:0x00de, B:30:0x00e4, B:31:0x00eb, B:74:0x01ab, B:76:0x01b1, B:78:0x01b7, B:71:0x01a4, B:60:0x0171, B:41:0x0116, B:79:0x01bc, B:81:0x01c7, B:83:0x01e4, B:85:0x01ee, B:86:0x01fb, B:88:0x0201, B:89:0x0208, B:134:0x02c9, B:131:0x02c2, B:120:0x0291, B:101:0x0238, B:13:0x006c, B:18:0x0076, B:92:0x020e, B:94:0x0216, B:97:0x021d, B:99:0x0234, B:32:0x00ee, B:34:0x00f6, B:37:0x00fd, B:39:0x0112, B:61:0x0174, B:63:0x017e, B:65:0x018d, B:68:0x019a, B:121:0x0294, B:123:0x029e, B:125:0x02ad, B:128:0x02b8, B:5:0x002d, B:7:0x0033), top: B:154:0x000d, inners: #3, #5, #9, #11, #11 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c7 A[Catch: Exception -> 0x0070, JSONException -> 0x0073, TryCatch #12 {JSONException -> 0x0073, Exception -> 0x0070, blocks: (B:3:0x000d, B:19:0x0079, B:23:0x00a8, B:25:0x00c7, B:27:0x00d1, B:28:0x00de, B:30:0x00e4, B:31:0x00eb, B:74:0x01ab, B:76:0x01b1, B:78:0x01b7, B:71:0x01a4, B:60:0x0171, B:41:0x0116, B:79:0x01bc, B:81:0x01c7, B:83:0x01e4, B:85:0x01ee, B:86:0x01fb, B:88:0x0201, B:89:0x0208, B:134:0x02c9, B:131:0x02c2, B:120:0x0291, B:101:0x0238, B:13:0x006c, B:18:0x0076, B:92:0x020e, B:94:0x0216, B:97:0x021d, B:99:0x0234, B:32:0x00ee, B:34:0x00f6, B:37:0x00fd, B:39:0x0112, B:61:0x0174, B:63:0x017e, B:65:0x018d, B:68:0x019a, B:121:0x0294, B:123:0x029e, B:125:0x02ad, B:128:0x02b8, B:5:0x002d, B:7:0x0033), top: B:154:0x000d, inners: #3, #5, #9, #11, #11 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0201 A[Catch: Exception -> 0x0070, JSONException -> 0x0073, TryCatch #12 {JSONException -> 0x0073, Exception -> 0x0070, blocks: (B:3:0x000d, B:19:0x0079, B:23:0x00a8, B:25:0x00c7, B:27:0x00d1, B:28:0x00de, B:30:0x00e4, B:31:0x00eb, B:74:0x01ab, B:76:0x01b1, B:78:0x01b7, B:71:0x01a4, B:60:0x0171, B:41:0x0116, B:79:0x01bc, B:81:0x01c7, B:83:0x01e4, B:85:0x01ee, B:86:0x01fb, B:88:0x0201, B:89:0x0208, B:134:0x02c9, B:131:0x02c2, B:120:0x0291, B:101:0x0238, B:13:0x006c, B:18:0x0076, B:92:0x020e, B:94:0x0216, B:97:0x021d, B:99:0x0234, B:32:0x00ee, B:34:0x00f6, B:37:0x00fd, B:39:0x0112, B:61:0x0174, B:63:0x017e, B:65:0x018d, B:68:0x019a, B:121:0x0294, B:123:0x029e, B:125:0x02ad, B:128:0x02b8, B:5:0x002d, B:7:0x0033), top: B:154:0x000d, inners: #3, #5, #9, #11, #11 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x020d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0216 A[Catch: Exception -> 0x021b, TryCatch #3 {Exception -> 0x021b, blocks: (B:92:0x020e, B:94:0x0216, B:97:0x021d, B:99:0x0234), top: B:141:0x020e, outer: #12 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0234 A[Catch: Exception -> 0x021b, TRY_LEAVE, TryCatch #3 {Exception -> 0x021b, blocks: (B:92:0x020e, B:94:0x0216, B:97:0x021d, B:99:0x0234), top: B:141:0x020e, outer: #12 }] */
    private String configInitEngineParam(String str, String str2, EngineSetting engineSetting) {
        boolean zEquals;
        String str3;
        boolean z11;
        boolean z12;
        boolean z13;
        String provisionPath;
        File file;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        boolean z14;
        boolean z15;
        String provisionPath2;
        File file2;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("appKey", str);
            jSONObject3.put("secretKey", str2);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("enable", engineSetting.isVADEnabled() ? 1 : 0);
            jSONObject3.put("vad", jSONObject4);
            try {
                if (engineSetting.isSDKLogEnabled()) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("enable", 1);
                    jSONObject5.put("output", AiUtil.externalFilesDir(getContext()) + "/sdklog.txt");
                    jSONObject5.put("level", engineSetting.getLogLevel());
                    jSONObject3.put("sdkLog", jSONObject5);
                    zEquals = engineSetting.getEngineType().equals("multi");
                    str3 = OYAvlbfUyD.JAwLi;
                    z11 = false;
                    if (zEquals) {
                        jSONObject2 = new JSONObject();
                        jSONObject2.put("enable", 1);
                        jSONObject2.put("connectTimeout", engineSetting.getConnectTimeout());
                        jSONObject2.put("serverTimeout", engineSetting.getServerTimeout());
                        if (engineSetting.getServerAddress() != null && engineSetting.getServerAddress().length() > 0) {
                            jSONObject2.put("serverList", BuildConfig.VERSION_NAME);
                            jSONObject2.put("server", engineSetting.getServerAddress());
                            jSONObject2.put("sdkCfgAddr", BuildConfig.VERSION_NAME);
                        }
                        if (engineSetting.getSdkCfgAddr() != null) {
                            jSONObject2.put("sdkCfgAddr", engineSetting.getSdkCfgAddr());
                        }
                        jSONObject3.put("cloud", jSONObject2);
                        try {
                            provisionPath2 = engineSetting.getProvisionPath();
                            file2 = this.provisionFile;
                            if (file2 != null) {
                                provisionPath2 = file2.getAbsolutePath();
                            }
                            MyLog.e(TAG, "2===>profile:" + provisionPath2);
                            if (MyUtil.isNotNull(provisionPath2)) {
                                jSONObject3.put(str3, provisionPath2);
                                try {
                                    if (MyUtil.isNotNull(engineSetting.getNativeResourcePath()) || !new File(engineSetting.getNativeResourcePath()).exists()) {
                                        MyLog.e(TAG, "multi native not exists");
                                        z14 = false;
                                    } else {
                                        jSONObject3.put("native", engineSetting.getNativeResourcePath());
                                        z14 = true;
                                    }
                                    try {
                                        if (MyUtil.isNotNull(engineSetting.getNativeDbPath()) || !new File(engineSetting.getNativeDbPath()).exists()) {
                                            MyLog.e(TAG, "multi native db not exists");
                                        } else {
                                            jSONObject3.put("db_res_path", engineSetting.getNativeDbPath());
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                        e.printStackTrace();
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    z14 = false;
                                }
                                try {
                                    if (MyUtil.isNotNull(engineSetting.getNativeCNResourcePath()) || !new File(engineSetting.getNativeCNResourcePath()).exists()) {
                                        MyLog.e(TAG, "multi native_cn not exists");
                                        z15 = false;
                                    } else {
                                        jSONObject3.put("native_cn", engineSetting.getNativeCNResourcePath());
                                        z15 = true;
                                    }
                                    z11 = z15;
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                if (z14 && !z11) {
                                    MyLog.e(TAG, "multi all native not exists");
                                    return null;
                                }
                                if (engineSetting.isAutoDetectNetwork()) {
                                    startNetworkTask();
                                }
                            } else {
                                if (MyUtil.isNotNull(engineSetting.getNativeResourcePath())) {
                                    MyLog.e(TAG, "multi native not exists");
                                    z14 = false;
                                } else {
                                    MyLog.e(TAG, "multi native not exists");
                                    z14 = false;
                                }
                                if (MyUtil.isNotNull(engineSetting.getNativeDbPath())) {
                                    MyLog.e(TAG, "multi native db not exists");
                                } else {
                                    MyLog.e(TAG, "multi native db not exists");
                                }
                                if (MyUtil.isNotNull(engineSetting.getNativeCNResourcePath())) {
                                    MyLog.e(TAG, "multi native_cn not exists");
                                    z15 = false;
                                } else {
                                    MyLog.e(TAG, "multi native_cn not exists");
                                    z15 = false;
                                }
                                z11 = z15;
                                if (z14) {
                                }
                                if (engineSetting.isAutoDetectNetwork()) {
                                    startNetworkTask();
                                }
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    } else if (engineSetting.getEngineType().equals("cloud")) {
                        jSONObject = new JSONObject();
                        jSONObject.put("enable", 1);
                        jSONObject.put("connectTimeout", engineSetting.getConnectTimeout());
                        jSONObject.put("serverTimeout", engineSetting.getServerTimeout());
                        if (engineSetting.getServerAddress() != null && engineSetting.getServerAddress().length() > 0) {
                            jSONObject.put("serverList", BuildConfig.VERSION_NAME);
                            jSONObject.put("server", engineSetting.getServerAddress());
                            jSONObject.put("sdkCfgAddr", BuildConfig.VERSION_NAME);
                        }
                        if (engineSetting.getSdkCfgAddr() != null) {
                            jSONObject.put("sdkCfgAddr", engineSetting.getSdkCfgAddr());
                        }
                        jSONObject3.put("cloud", jSONObject);
                    } else {
                        try {
                            provisionPath = engineSetting.getProvisionPath();
                            file = this.provisionFile;
                            if (file != null) {
                                provisionPath = file.getAbsolutePath();
                            }
                            MyLog.e(TAG, "1===>profile:" + provisionPath);
                            if (MyUtil.isNotNull(provisionPath)) {
                                jSONObject3.put(str3, provisionPath);
                                try {
                                    if (MyUtil.isNotNull(engineSetting.getNativeResourcePath()) || !new File(engineSetting.getNativeResourcePath()).exists()) {
                                        MyLog.e(TAG, "native not exists");
                                        z12 = false;
                                    } else {
                                        jSONObject3.put("native", engineSetting.getNativeResourcePath());
                                        z12 = true;
                                    }
                                    try {
                                        if (MyUtil.isNotNull(engineSetting.getNativeDbPath()) || !new File(engineSetting.getNativeDbPath()).exists()) {
                                            MyLog.e(TAG, "native db not exists");
                                        } else {
                                            jSONObject3.put("db_res_path", engineSetting.getNativeDbPath());
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        z12 = z12;
                                        e.printStackTrace();
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    z12 = false;
                                }
                                try {
                                    if (MyUtil.isNotNull(engineSetting.getNativeCNResourcePath()) || !new File(engineSetting.getNativeCNResourcePath()).exists()) {
                                        MyLog.e(TAG, "native_cn not exists");
                                        z13 = false;
                                    } else {
                                        jSONObject3.put("native_cn", engineSetting.getNativeCNResourcePath());
                                        z13 = true;
                                    }
                                    z11 = z13;
                                } catch (Exception e15) {
                                    e15.printStackTrace();
                                }
                                if (!z12 && !z11) {
                                    MyLog.e(TAG, "all native not exists");
                                    return null;
                                }
                            } else {
                                if (MyUtil.isNotNull(engineSetting.getNativeResourcePath())) {
                                    MyLog.e(TAG, "native not exists");
                                    z12 = false;
                                } else {
                                    MyLog.e(TAG, "native not exists");
                                    z12 = false;
                                }
                                if (MyUtil.isNotNull(engineSetting.getNativeDbPath())) {
                                    MyLog.e(TAG, "native db not exists");
                                } else {
                                    MyLog.e(TAG, "native db not exists");
                                }
                                if (MyUtil.isNotNull(engineSetting.getNativeCNResourcePath())) {
                                    MyLog.e(TAG, "native_cn not exists");
                                    z13 = false;
                                } else {
                                    MyLog.e(TAG, "native_cn not exists");
                                    z13 = false;
                                }
                                z11 = z13;
                                if (!z12) {
                                    MyLog.e(TAG, "all native not exists");
                                    return null;
                                }
                            }
                        } catch (Exception e16) {
                            e16.printStackTrace();
                        }
                    }
                } else {
                    zEquals = engineSetting.getEngineType().equals("multi");
                    str3 = OYAvlbfUyD.JAwLi;
                    z11 = false;
                    if (zEquals) {
                        jSONObject2 = new JSONObject();
                        jSONObject2.put("enable", 1);
                        jSONObject2.put("connectTimeout", engineSetting.getConnectTimeout());
                        jSONObject2.put("serverTimeout", engineSetting.getServerTimeout());
                        if (engineSetting.getServerAddress() != null) {
                            jSONObject2.put("serverList", BuildConfig.VERSION_NAME);
                            jSONObject2.put("server", engineSetting.getServerAddress());
                            jSONObject2.put("sdkCfgAddr", BuildConfig.VERSION_NAME);
                        }
                        if (engineSetting.getSdkCfgAddr() != null) {
                            jSONObject2.put("sdkCfgAddr", engineSetting.getSdkCfgAddr());
                        }
                        jSONObject3.put("cloud", jSONObject2);
                        provisionPath2 = engineSetting.getProvisionPath();
                        file2 = this.provisionFile;
                        if (file2 != null) {
                            provisionPath2 = file2.getAbsolutePath();
                        }
                        MyLog.e(TAG, "2===>profile:" + provisionPath2);
                        if (MyUtil.isNotNull(provisionPath2)) {
                            jSONObject3.put(str3, provisionPath2);
                            if (MyUtil.isNotNull(engineSetting.getNativeResourcePath())) {
                                MyLog.e(TAG, "multi native not exists");
                                z14 = false;
                            } else {
                                MyLog.e(TAG, "multi native not exists");
                                z14 = false;
                            }
                            if (MyUtil.isNotNull(engineSetting.getNativeDbPath())) {
                                MyLog.e(TAG, "multi native db not exists");
                            } else {
                                MyLog.e(TAG, "multi native db not exists");
                            }
                            if (MyUtil.isNotNull(engineSetting.getNativeCNResourcePath())) {
                                MyLog.e(TAG, "multi native_cn not exists");
                                z15 = false;
                            } else {
                                MyLog.e(TAG, "multi native_cn not exists");
                                z15 = false;
                            }
                            z11 = z15;
                            if (z14) {
                            }
                            if (engineSetting.isAutoDetectNetwork()) {
                                startNetworkTask();
                            }
                        } else {
                            if (MyUtil.isNotNull(engineSetting.getNativeResourcePath())) {
                                MyLog.e(TAG, "multi native not exists");
                                z14 = false;
                            } else {
                                MyLog.e(TAG, "multi native not exists");
                                z14 = false;
                            }
                            if (MyUtil.isNotNull(engineSetting.getNativeDbPath())) {
                                MyLog.e(TAG, "multi native db not exists");
                            } else {
                                MyLog.e(TAG, "multi native db not exists");
                            }
                            if (MyUtil.isNotNull(engineSetting.getNativeCNResourcePath())) {
                                MyLog.e(TAG, "multi native_cn not exists");
                                z15 = false;
                            } else {
                                MyLog.e(TAG, "multi native_cn not exists");
                                z15 = false;
                            }
                            z11 = z15;
                            if (z14) {
                            }
                            if (engineSetting.isAutoDetectNetwork()) {
                                startNetworkTask();
                            }
                        }
                    } else if (engineSetting.getEngineType().equals("cloud")) {
                        jSONObject = new JSONObject();
                        jSONObject.put("enable", 1);
                        jSONObject.put("connectTimeout", engineSetting.getConnectTimeout());
                        jSONObject.put("serverTimeout", engineSetting.getServerTimeout());
                        if (engineSetting.getServerAddress() != null) {
                            jSONObject.put("serverList", BuildConfig.VERSION_NAME);
                            jSONObject.put("server", engineSetting.getServerAddress());
                            jSONObject.put("sdkCfgAddr", BuildConfig.VERSION_NAME);
                        }
                        if (engineSetting.getSdkCfgAddr() != null) {
                            jSONObject.put("sdkCfgAddr", engineSetting.getSdkCfgAddr());
                        }
                        jSONObject3.put("cloud", jSONObject);
                    } else {
                        provisionPath = engineSetting.getProvisionPath();
                        file = this.provisionFile;
                        if (file != null) {
                            provisionPath = file.getAbsolutePath();
                        }
                        MyLog.e(TAG, "1===>profile:" + provisionPath);
                        if (MyUtil.isNotNull(provisionPath)) {
                            jSONObject3.put(str3, provisionPath);
                            if (MyUtil.isNotNull(engineSetting.getNativeResourcePath())) {
                                MyLog.e(TAG, "native not exists");
                                z12 = false;
                            } else {
                                MyLog.e(TAG, "native not exists");
                                z12 = false;
                            }
                            if (MyUtil.isNotNull(engineSetting.getNativeDbPath())) {
                                MyLog.e(TAG, "native db not exists");
                            } else {
                                MyLog.e(TAG, "native db not exists");
                            }
                            if (MyUtil.isNotNull(engineSetting.getNativeCNResourcePath())) {
                                MyLog.e(TAG, "native_cn not exists");
                                z13 = false;
                            } else {
                                MyLog.e(TAG, "native_cn not exists");
                                z13 = false;
                            }
                            z11 = z13;
                            if (!z12) {
                                MyLog.e(TAG, "all native not exists");
                                return null;
                            }
                        } else {
                            if (MyUtil.isNotNull(engineSetting.getNativeResourcePath())) {
                                MyLog.e(TAG, "native not exists");
                                z12 = false;
                            } else {
                                MyLog.e(TAG, "native not exists");
                                z12 = false;
                            }
                            if (MyUtil.isNotNull(engineSetting.getNativeDbPath())) {
                                MyLog.e(TAG, "native db not exists");
                            } else {
                                MyLog.e(TAG, "native db not exists");
                            }
                            if (MyUtil.isNotNull(engineSetting.getNativeCNResourcePath())) {
                                MyLog.e(TAG, "native_cn not exists");
                                z13 = false;
                            } else {
                                MyLog.e(TAG, "native_cn not exists");
                                z13 = false;
                            }
                            z11 = z13;
                            if (!z12) {
                                MyLog.e(TAG, "all native not exists");
                                return null;
                            }
                        }
                    }
                }
            } catch (Exception e17) {
                e17.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        } catch (JSONException e18) {
            e18.printStackTrace();
        } catch (Exception e19) {
            e19.printStackTrace();
        }
        return jSONObject3.toString();
    }

    @Deprecated
    public void existsAudioTrans(RecordSetting recordSetting, OnRecordListener onRecordListener) {
        this.mOnRecordListener = onRecordListener;
        existsAudioTrans(recordSetting);
    }

    public String getSDKVersion() {
        byte[] bArr = new byte[1024];
        SkEgn.skegn_opt(0L, 1, bArr, 1024);
        return new String(bArr, Charset.forName(FpIL.LsWj)).trim();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01cc A[Catch: Exception -> 0x0066, TryCatch #4 {Exception -> 0x0066, blocks: (B:16:0x0054, B:18:0x0058, B:21:0x0069, B:23:0x0074, B:24:0x009e, B:60:0x01a7, B:62:0x01cc, B:64:0x01f7, B:66:0x0206, B:67:0x0209, B:68:0x0210, B:69:0x0240, B:71:0x025f, B:25:0x00a6, B:45:0x0128, B:59:0x01a2, B:58:0x019f, B:41:0x011e, B:44:0x0125), top: B:82:0x0054, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01f7 A[Catch: Exception -> 0x0066, TryCatch #4 {Exception -> 0x0066, blocks: (B:16:0x0054, B:18:0x0058, B:21:0x0069, B:23:0x0074, B:24:0x009e, B:60:0x01a7, B:62:0x01cc, B:64:0x01f7, B:66:0x0206, B:67:0x0209, B:68:0x0210, B:69:0x0240, B:71:0x025f, B:25:0x00a6, B:45:0x0128, B:59:0x01a2, B:58:0x019f, B:41:0x011e, B:44:0x0125), top: B:82:0x0054, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0206 A[Catch: Exception -> 0x0066, TryCatch #4 {Exception -> 0x0066, blocks: (B:16:0x0054, B:18:0x0058, B:21:0x0069, B:23:0x0074, B:24:0x009e, B:60:0x01a7, B:62:0x01cc, B:64:0x01f7, B:66:0x0206, B:67:0x0209, B:68:0x0210, B:69:0x0240, B:71:0x025f, B:25:0x00a6, B:45:0x0128, B:59:0x01a2, B:58:0x019f, B:41:0x011e, B:44:0x0125), top: B:82:0x0054, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0210 A[Catch: Exception -> 0x0066, TryCatch #4 {Exception -> 0x0066, blocks: (B:16:0x0054, B:18:0x0058, B:21:0x0069, B:23:0x0074, B:24:0x009e, B:60:0x01a7, B:62:0x01cc, B:64:0x01f7, B:66:0x0206, B:67:0x0209, B:68:0x0210, B:69:0x0240, B:71:0x025f, B:25:0x00a6, B:45:0x0128, B:59:0x01a2, B:58:0x019f, B:41:0x011e, B:44:0x0125), top: B:82:0x0054, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0240 A[Catch: Exception -> 0x0066, TryCatch #4 {Exception -> 0x0066, blocks: (B:16:0x0054, B:18:0x0058, B:21:0x0069, B:23:0x0074, B:24:0x009e, B:60:0x01a7, B:62:0x01cc, B:64:0x01f7, B:66:0x0206, B:67:0x0209, B:68:0x0210, B:69:0x0240, B:71:0x025f, B:25:0x00a6, B:45:0x0128, B:59:0x01a2, B:58:0x019f, B:41:0x011e, B:44:0x0125), top: B:82:0x0054, inners: #5 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x01cc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x0210, please report this as an issue */
    public void initCloudEngine(String str, String str2, String str3, EngineSetting engineSetting) {
        synchronized (this) {
            try {
                if (this.isInitializing) {
                    MyLog.e(TAG, "Initialization in progress, ignoring duplicate calls");
                    return;
                }
                this.isInitializing = true;
                LogCat.initLogCat(this.mContext, str, str3);
                startTimedPushlogTimer();
                this.mCurrentEngineSetting = null;
                MyLog.e(TAG, "===>initCloudEngine");
                if (checkAppKeyAndSecretKey(str, str2)) {
                    MyLog.e(TAG, "mHandler===>" + this.mHandler);
                    try {
                        this.mCurrentEngineSetting = engineSetting;
                        if (engineSetting == null) {
                            EngineSetting defaultCloudInstance = EngineSetting.getDefaultCloudInstance(getContext());
                            this.mCurrentEngineSetting = defaultCloudInstance;
                            defaultCloudInstance.setUserId(str3);
                        }
                        this.mCurrentEngineSetting.setUserId(str3);
                        if (this.mCurrentEngine != null) {
                            MyLog.e(TAG, "cloud delete exists engine:" + this.mCurrentEngine + ",engine:" + this.engine);
                            SkEgn.skegn_delete(this.engine);
                            this.engine = 0L;
                            this.status1 = engine_status.STOP;
                            this.mCurrentEngine = null;
                        }
                        cancelRecordTimer();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            this.mOnInitEngineListener = this.mCurrentEngineSetting.getOnInitEngineListener();
                            this.mHandler.sendEmptyMessage(1);
                            jSONObject.put("appKey", str);
                            jSONObject.put("secretKey", str2);
                            try {
                                EngineSetting engineSetting2 = this.mCurrentEngineSetting;
                                if (engineSetting2 != null && engineSetting2.isVADEnabled()) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("enable", 1);
                                    jSONObject.put("vad", jSONObject2);
                                }
                                EngineSetting engineSetting3 = this.mCurrentEngineSetting;
                                if (engineSetting3 != null && engineSetting3.isSDKLogEnabled()) {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("enable", 1);
                                    jSONObject3.put("output", AiUtil.externalFilesDir(getContext()) + "/sdklog.txt");
                                    jSONObject3.put("level", this.mCurrentEngineSetting.getLogLevel());
                                    jSONObject.put("sdkLog", jSONObject3);
                                }
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("enable", 1);
                            jSONObject4.put("connectTimeout", this.mCurrentEngineSetting.getConnectTimeout());
                            jSONObject4.put("serverTimeout", this.mCurrentEngineSetting.getServerTimeout());
                            try {
                                if (MyUtil.isNotNull(this.mCurrentEngineSetting.getServerAddress())) {
                                    jSONObject4.put("server", this.mCurrentEngineSetting.getServerAddress());
                                    jSONObject4.put("serverList", BuildConfig.VERSION_NAME);
                                    jSONObject4.put("sdkCfgAddr", BuildConfig.VERSION_NAME);
                                }
                                if (MyUtil.isNotNull(this.mCurrentEngineSetting.getSdkCfgAddr())) {
                                    jSONObject4.put("sdkCfgAddr", this.mCurrentEngineSetting.getSdkCfgAddr());
                                }
                                if (MyUtil.isNotNull(this.mCurrentEngineSetting.getServerList())) {
                                    jSONObject4.put("serverList", this.mCurrentEngineSetting.getServerList());
                                    jSONObject.put("cloud", jSONObject4);
                                    MyLog.e(TAG, "初始化参数cfg===>" + jSONObject.toString().replace(str2, BuildConfig.VERSION_NAME));
                                    this.mCurrentEngine = "cloud";
                                    if (SkEgn.isLibraryLoaded()) {
                                        this.engine = SkEgn.skegn_new(jSONObject.toString(), getContext());
                                        MyLog.e(TAG, "cloud engine:" + String.valueOf(this.engine));
                                        if (this.engine != 0) {
                                            MyLog.e(TAG, "初始化引擎成功");
                                            if (this.mCurrentEngineSetting.isAutoDetectNetwork()) {
                                                startNetworkTask();
                                            }
                                            this.mHandler.sendEmptyMessage(2);
                                        } else {
                                            MyLog.e(TAG, "初始化引擎失败");
                                            int iSkegn_get_last_error = SkEgn.skegn_get_last_error();
                                            Message message = new Message();
                                            message.what = 3;
                                            message.obj = "error:" + String.valueOf(iSkegn_get_last_error);
                                            this.mHandler.sendMessage(message);
                                            LogCat.pushLog(this.mContext);
                                        }
                                    } else {
                                        MyLog.e(TAG, "初始化引擎失败");
                                        Message message2 = new Message();
                                        message2.what = 3;
                                        message2.obj = "error: so库加载失败";
                                        this.mHandler.sendMessage(message2);
                                        LogCat.pushLog(this.mContext);
                                    }
                                } else {
                                    jSONObject.put("cloud", jSONObject4);
                                    MyLog.e(TAG, "初始化参数cfg===>" + jSONObject.toString().replace(str2, BuildConfig.VERSION_NAME));
                                    this.mCurrentEngine = "cloud";
                                    if (SkEgn.isLibraryLoaded()) {
                                        this.engine = SkEgn.skegn_new(jSONObject.toString(), getContext());
                                        MyLog.e(TAG, "cloud engine:" + String.valueOf(this.engine));
                                        if (this.engine != 0) {
                                            MyLog.e(TAG, "初始化引擎成功");
                                            if (this.mCurrentEngineSetting.isAutoDetectNetwork()) {
                                                startNetworkTask();
                                            }
                                            this.mHandler.sendEmptyMessage(2);
                                        } else {
                                            MyLog.e(TAG, "初始化引擎失败");
                                            int iSkegn_get_last_error2 = SkEgn.skegn_get_last_error();
                                            Message message3 = new Message();
                                            message3.what = 3;
                                            message3.obj = "error:" + String.valueOf(iSkegn_get_last_error2);
                                            this.mHandler.sendMessage(message3);
                                            LogCat.pushLog(this.mContext);
                                        }
                                    } else {
                                        MyLog.e(TAG, "初始化引擎失败");
                                        Message message4 = new Message();
                                        message4.what = 3;
                                        message4.obj = "error: so库加载失败";
                                        this.mHandler.sendMessage(message4);
                                        LogCat.pushLog(this.mContext);
                                    }
                                }
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        } catch (Exception e11) {
                            MyLog.e(TAG, "初始化引擎失败");
                            Message message5 = new Message();
                            message5.what = 3;
                            message5.obj = e11.getMessage();
                            this.mHandler.sendMessage(message5);
                            e11.printStackTrace();
                            LogCat.pushLog(this.mContext);
                            this.isInitializing = false;
                            return;
                        }
                    } catch (Exception e12) {
                        MyLog.e(TAG, "初始化引擎失败");
                        Message message6 = new Message();
                        message6.what = 3;
                        message6.obj = e12.getMessage();
                        this.mHandler.sendMessage(message6);
                        e12.printStackTrace();
                        LogCat.pushLog(this.mContext);
                        this.isInitializing = false;
                        return;
                    }
                }
                this.isInitializing = false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x016d A[Catch: Exception -> 0x018a, TryCatch #3 {Exception -> 0x018a, blocks: (B:56:0x0161, B:58:0x016d, B:60:0x017e, B:63:0x018c), top: B:108:0x0161, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a4 A[Catch: Exception -> 0x01c1, TryCatch #7 {Exception -> 0x01c1, blocks: (B:67:0x0198, B:69:0x01a4, B:71:0x01b5, B:74:0x01c3), top: B:111:0x0198, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c3 A[Catch: Exception -> 0x01c1, TRY_LEAVE, TryCatch #7 {Exception -> 0x01c1, blocks: (B:67:0x0198, B:69:0x01a4, B:71:0x01b5, B:74:0x01c3), top: B:111:0x0198, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01da A[Catch: Exception -> 0x01f7, TryCatch #4 {Exception -> 0x01f7, blocks: (B:77:0x01ce, B:79:0x01da, B:81:0x01eb, B:84:0x01f9), top: B:109:0x01ce, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0206 A[Catch: Exception -> 0x00a1, TryCatch #8 {Exception -> 0x00a1, blocks: (B:22:0x0068, B:24:0x006e, B:27:0x00a4, B:38:0x00ef, B:90:0x0227, B:92:0x024c, B:94:0x0277, B:95:0x0285, B:96:0x02b5, B:88:0x0206, B:86:0x0201, B:76:0x01cb, B:65:0x0194, B:54:0x015a, B:55:0x015e, B:37:0x00ec, B:28:0x00be, B:30:0x00c8, B:33:0x00cf, B:35:0x00e6, B:56:0x0161, B:58:0x016d, B:60:0x017e, B:63:0x018c, B:77:0x01ce, B:79:0x01da, B:81:0x01eb, B:84:0x01f9, B:67:0x0198, B:69:0x01a4, B:71:0x01b5, B:74:0x01c3, B:39:0x00f9, B:41:0x00fd, B:43:0x0103, B:48:0x0117, B:50:0x011b, B:52:0x0121), top: B:112:0x0068, outer: #6, inners: #2, #3, #4, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x024c A[Catch: Exception -> 0x00a1, TryCatch #8 {Exception -> 0x00a1, blocks: (B:22:0x0068, B:24:0x006e, B:27:0x00a4, B:38:0x00ef, B:90:0x0227, B:92:0x024c, B:94:0x0277, B:95:0x0285, B:96:0x02b5, B:88:0x0206, B:86:0x0201, B:76:0x01cb, B:65:0x0194, B:54:0x015a, B:55:0x015e, B:37:0x00ec, B:28:0x00be, B:30:0x00c8, B:33:0x00cf, B:35:0x00e6, B:56:0x0161, B:58:0x016d, B:60:0x017e, B:63:0x018c, B:77:0x01ce, B:79:0x01da, B:81:0x01eb, B:84:0x01f9, B:67:0x0198, B:69:0x01a4, B:71:0x01b5, B:74:0x01c3, B:39:0x00f9, B:41:0x00fd, B:43:0x0103, B:48:0x0117, B:50:0x011b, B:52:0x0121), top: B:112:0x0068, outer: #6, inners: #2, #3, #4, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0277 A[Catch: Exception -> 0x00a1, TryCatch #8 {Exception -> 0x00a1, blocks: (B:22:0x0068, B:24:0x006e, B:27:0x00a4, B:38:0x00ef, B:90:0x0227, B:92:0x024c, B:94:0x0277, B:95:0x0285, B:96:0x02b5, B:88:0x0206, B:86:0x0201, B:76:0x01cb, B:65:0x0194, B:54:0x015a, B:55:0x015e, B:37:0x00ec, B:28:0x00be, B:30:0x00c8, B:33:0x00cf, B:35:0x00e6, B:56:0x0161, B:58:0x016d, B:60:0x017e, B:63:0x018c, B:77:0x01ce, B:79:0x01da, B:81:0x01eb, B:84:0x01f9, B:67:0x0198, B:69:0x01a4, B:71:0x01b5, B:74:0x01c3, B:39:0x00f9, B:41:0x00fd, B:43:0x0103, B:48:0x0117, B:50:0x011b, B:52:0x0121), top: B:112:0x0068, outer: #6, inners: #2, #3, #4, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0285 A[Catch: Exception -> 0x00a1, TryCatch #8 {Exception -> 0x00a1, blocks: (B:22:0x0068, B:24:0x006e, B:27:0x00a4, B:38:0x00ef, B:90:0x0227, B:92:0x024c, B:94:0x0277, B:95:0x0285, B:96:0x02b5, B:88:0x0206, B:86:0x0201, B:76:0x01cb, B:65:0x0194, B:54:0x015a, B:55:0x015e, B:37:0x00ec, B:28:0x00be, B:30:0x00c8, B:33:0x00cf, B:35:0x00e6, B:56:0x0161, B:58:0x016d, B:60:0x017e, B:63:0x018c, B:77:0x01ce, B:79:0x01da, B:81:0x01eb, B:84:0x01f9, B:67:0x0198, B:69:0x01a4, B:71:0x01b5, B:74:0x01c3, B:39:0x00f9, B:41:0x00fd, B:43:0x0103, B:48:0x0117, B:50:0x011b, B:52:0x0121), top: B:112:0x0068, outer: #6, inners: #2, #3, #4, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x02b5 A[Catch: Exception -> 0x00a1, TRY_LEAVE, TryCatch #8 {Exception -> 0x00a1, blocks: (B:22:0x0068, B:24:0x006e, B:27:0x00a4, B:38:0x00ef, B:90:0x0227, B:92:0x024c, B:94:0x0277, B:95:0x0285, B:96:0x02b5, B:88:0x0206, B:86:0x0201, B:76:0x01cb, B:65:0x0194, B:54:0x015a, B:55:0x015e, B:37:0x00ec, B:28:0x00be, B:30:0x00c8, B:33:0x00cf, B:35:0x00e6, B:56:0x0161, B:58:0x016d, B:60:0x017e, B:63:0x018c, B:77:0x01ce, B:79:0x01da, B:81:0x01eb, B:84:0x01f9, B:67:0x0198, B:69:0x01a4, B:71:0x01b5, B:74:0x01c3, B:39:0x00f9, B:41:0x00fd, B:43:0x0103, B:48:0x0117, B:50:0x011b, B:52:0x0121), top: B:112:0x0068, outer: #6, inners: #2, #3, #4, #7, #9 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x024c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x0285, please report this as an issue */
    public void initNativeEngine(String str, String str2, String str3, EngineSetting engineSetting) {
        EngineSetting engineSetting2;
        EngineSetting engineSetting3;
        synchronized (this) {
            try {
                if (this.isInitializing) {
                    MyLog.e(TAG, "Initialization in progress, ignoring duplicate calls");
                    return;
                }
                boolean z11 = true;
                this.isInitializing = true;
                LogCat.initLogCat(this.mContext, str, str3);
                startTimedPushlogTimer();
                MyLog.e(TAG, "===>initNativeEngine");
                if (checkAppKeyAndSecretKey(str, str2)) {
                    MyLog.e(TAG, "mHandler===>" + this.mHandler);
                    try {
                        this.mCurrentEngineSetting = engineSetting;
                        if (engineSetting == null) {
                            EngineSetting defaultNativeInstance = EngineSetting.getDefaultNativeInstance(getContext());
                            this.mCurrentEngineSetting = defaultNativeInstance;
                            defaultNativeInstance.setUserId(str3);
                        }
                        try {
                            if (this.mCurrentEngine != null) {
                                MyLog.e("sss", "SkEgn.skegn_delete");
                                MyLog.e(TAG, "native delete exists engine:" + this.mCurrentEngine + ",engine:" + this.engine);
                                SkEgn.skegn_delete(this.engine);
                                this.engine = 0L;
                                this.status1 = engine_status.STOP;
                                this.mCurrentEngine = null;
                            }
                            cancelRecordTimer();
                            this.mCurrentEngineSetting.setUserId(str3);
                            this.mOnInitEngineListener = this.mCurrentEngineSetting.getOnInitEngineListener();
                            this.mHandler.sendEmptyMessage(1);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                String provisionPath = this.mCurrentEngineSetting.getProvisionPath();
                                File file = this.provisionFile;
                                if (file != null) {
                                    provisionPath = file.getAbsolutePath();
                                }
                                MyLog.e(TAG, "===>profile:" + provisionPath);
                                if (MyUtil.isNotNull(provisionPath)) {
                                    jSONObject.put("provision", provisionPath);
                                    jSONObject.put("appKey", str);
                                    jSONObject.put("secretKey", str2);
                                    try {
                                        engineSetting2 = this.mCurrentEngineSetting;
                                        if (engineSetting2 != null && engineSetting2.isVADEnabled()) {
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("enable", 1);
                                            jSONObject.put("vad", jSONObject2);
                                        }
                                        engineSetting3 = this.mCurrentEngineSetting;
                                        if (engineSetting3 == null && engineSetting3.isSDKLogEnabled()) {
                                            JSONObject jSONObject3 = new JSONObject();
                                            jSONObject3.put("enable", 1);
                                            jSONObject3.put("output", AiUtil.externalFilesDir(getContext()) + "/sdklog.txt");
                                            jSONObject3.put("level", this.mCurrentEngineSetting.getLogLevel());
                                            jSONObject.put("sdkLog", jSONObject3);
                                            if (MyUtil.isNotNull(this.mCurrentEngineSetting.getNativeResourcePath())) {
                                            }
                                            MyLog.e(TAG, "初始化离线引擎失败, native not exists");
                                            z11 = false;
                                            if (MyUtil.isNotNull(this.mCurrentEngineSetting.getNativeDbPath())) {
                                                MyLog.e(TAG, "初始化离线引擎失败, native db not exists");
                                            } else {
                                                MyLog.e(TAG, "初始化离线引擎失败, native db not exists");
                                            }
                                            if (MyUtil.isNotNull(this.mCurrentEngineSetting.getNativeCNResourcePath())) {
                                            }
                                            MyLog.e(TAG, "初始化离线引擎失败, native_cn not exists");
                                            if (!z11) {
                                                MyLog.e(TAG, "初始化离线引擎失败, all native not exists");
                                                Message message = new Message();
                                                message.what = 3;
                                                message.obj = "all native not exists";
                                                this.mHandler.sendMessage(message);
                                                LogCat.pushLog(this.mContext);
                                                this.isInitializing = false;
                                                return;
                                            }
                                            MyLog.e(TAG, "初始化参数cfg===>" + jSONObject.toString().replace(str2, BuildConfig.VERSION_NAME));
                                            this.mCurrentEngine = "native";
                                            if (SkEgn.isLibraryLoaded()) {
                                                this.engine = SkEgn.skegn_new(jSONObject.toString(), getContext());
                                                MyLog.e(TAG, "native engine:" + String.valueOf(this.engine));
                                                if (this.engine != 0) {
                                                    MyLog.e(TAG, "初始化引擎成功");
                                                    this.mHandler.sendEmptyMessage(2);
                                                } else {
                                                    MyLog.e(TAG, "初始化引擎失败");
                                                    int iSkegn_get_last_error = SkEgn.skegn_get_last_error();
                                                    Message message2 = new Message();
                                                    message2.what = 3;
                                                    message2.obj = "error:" + String.valueOf(iSkegn_get_last_error);
                                                    this.mHandler.sendMessage(message2);
                                                    LogCat.pushLog(this.mContext);
                                                }
                                            } else {
                                                MyLog.e(TAG, "初始化引擎失败");
                                                Message message3 = new Message();
                                                message3.what = 3;
                                                message3.obj = "error: so库加载失败";
                                                this.mHandler.sendMessage(message3);
                                                LogCat.pushLog(this.mContext);
                                            }
                                        } else {
                                            try {
                                                if (MyUtil.isNotNull(this.mCurrentEngineSetting.getNativeResourcePath()) || !new File(this.mCurrentEngineSetting.getNativeResourcePath()).exists()) {
                                                    MyLog.e(TAG, "初始化离线引擎失败, native not exists");
                                                    z11 = false;
                                                } else {
                                                    jSONObject.put("native", this.mCurrentEngineSetting.getNativeResourcePath());
                                                }
                                            } catch (Exception e8) {
                                                e8.printStackTrace();
                                            }
                                            try {
                                                if (MyUtil.isNotNull(this.mCurrentEngineSetting.getNativeDbPath()) || !new File(this.mCurrentEngineSetting.getNativeDbPath()).exists()) {
                                                    MyLog.e(TAG, "初始化离线引擎失败, native db not exists");
                                                } else {
                                                    jSONObject.put("db_res_path", this.mCurrentEngineSetting.getNativeDbPath());
                                                }
                                            } catch (Exception e10) {
                                                e10.printStackTrace();
                                            }
                                            try {
                                                if (MyUtil.isNotNull(this.mCurrentEngineSetting.getNativeCNResourcePath()) || !new File(this.mCurrentEngineSetting.getNativeCNResourcePath()).exists()) {
                                                    MyLog.e(TAG, "初始化离线引擎失败, native_cn not exists");
                                                    if (!z11) {
                                                        MyLog.e(TAG, "初始化离线引擎失败, all native not exists");
                                                        Message message4 = new Message();
                                                        message4.what = 3;
                                                        message4.obj = "all native not exists";
                                                        this.mHandler.sendMessage(message4);
                                                        LogCat.pushLog(this.mContext);
                                                        this.isInitializing = false;
                                                        return;
                                                    }
                                                } else {
                                                    jSONObject.put("native_cn", this.mCurrentEngineSetting.getNativeCNResourcePath());
                                                }
                                            } catch (Exception e11) {
                                                e11.printStackTrace();
                                            }
                                            MyLog.e(TAG, "初始化参数cfg===>" + jSONObject.toString().replace(str2, BuildConfig.VERSION_NAME));
                                            this.mCurrentEngine = "native";
                                            if (SkEgn.isLibraryLoaded()) {
                                                this.engine = SkEgn.skegn_new(jSONObject.toString(), getContext());
                                                MyLog.e(TAG, "native engine:" + String.valueOf(this.engine));
                                                if (this.engine != 0) {
                                                    MyLog.e(TAG, "初始化引擎成功");
                                                    this.mHandler.sendEmptyMessage(2);
                                                } else {
                                                    MyLog.e(TAG, "初始化引擎失败");
                                                    int iSkegn_get_last_error2 = SkEgn.skegn_get_last_error();
                                                    Message message5 = new Message();
                                                    message5.what = 3;
                                                    message5.obj = "error:" + String.valueOf(iSkegn_get_last_error2);
                                                    this.mHandler.sendMessage(message5);
                                                    LogCat.pushLog(this.mContext);
                                                }
                                            } else {
                                                MyLog.e(TAG, "初始化引擎失败");
                                                Message message6 = new Message();
                                                message6.what = 3;
                                                message6.obj = "error: so库加载失败";
                                                this.mHandler.sendMessage(message6);
                                                LogCat.pushLog(this.mContext);
                                            }
                                        }
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                    } catch (Throwable th2) {
                                        th2.printStackTrace();
                                    }
                                } else {
                                    jSONObject.put("appKey", str);
                                    jSONObject.put("secretKey", str2);
                                    engineSetting2 = this.mCurrentEngineSetting;
                                    if (engineSetting2 != null) {
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put("enable", 1);
                                        jSONObject.put("vad", jSONObject4);
                                    }
                                    engineSetting3 = this.mCurrentEngineSetting;
                                    if (engineSetting3 == null) {
                                        if (MyUtil.isNotNull(this.mCurrentEngineSetting.getNativeResourcePath())) {
                                        }
                                        MyLog.e(TAG, "初始化离线引擎失败, native not exists");
                                        z11 = false;
                                        if (MyUtil.isNotNull(this.mCurrentEngineSetting.getNativeDbPath())) {
                                            MyLog.e(TAG, "初始化离线引擎失败, native db not exists");
                                        } else {
                                            MyLog.e(TAG, "初始化离线引擎失败, native db not exists");
                                        }
                                        if (MyUtil.isNotNull(this.mCurrentEngineSetting.getNativeCNResourcePath())) {
                                        }
                                        MyLog.e(TAG, "初始化离线引擎失败, native_cn not exists");
                                        if (!z11) {
                                            MyLog.e(TAG, "初始化离线引擎失败, all native not exists");
                                            Message message7 = new Message();
                                            message7.what = 3;
                                            message7.obj = "all native not exists";
                                            this.mHandler.sendMessage(message7);
                                            LogCat.pushLog(this.mContext);
                                            this.isInitializing = false;
                                            return;
                                        }
                                        MyLog.e(TAG, "初始化参数cfg===>" + jSONObject.toString().replace(str2, BuildConfig.VERSION_NAME));
                                        this.mCurrentEngine = "native";
                                        if (SkEgn.isLibraryLoaded()) {
                                            this.engine = SkEgn.skegn_new(jSONObject.toString(), getContext());
                                            MyLog.e(TAG, "native engine:" + String.valueOf(this.engine));
                                            if (this.engine != 0) {
                                                MyLog.e(TAG, "初始化引擎成功");
                                                this.mHandler.sendEmptyMessage(2);
                                            } else {
                                                MyLog.e(TAG, "初始化引擎失败");
                                                int iSkegn_get_last_error3 = SkEgn.skegn_get_last_error();
                                                Message message8 = new Message();
                                                message8.what = 3;
                                                message8.obj = "error:" + String.valueOf(iSkegn_get_last_error3);
                                                this.mHandler.sendMessage(message8);
                                                LogCat.pushLog(this.mContext);
                                            }
                                        } else {
                                            MyLog.e(TAG, "初始化引擎失败");
                                            Message message9 = new Message();
                                            message9.what = 3;
                                            message9.obj = "error: so库加载失败";
                                            this.mHandler.sendMessage(message9);
                                            LogCat.pushLog(this.mContext);
                                        }
                                    } else {
                                        if (MyUtil.isNotNull(this.mCurrentEngineSetting.getNativeResourcePath())) {
                                        }
                                        MyLog.e(TAG, "初始化离线引擎失败, native not exists");
                                        z11 = false;
                                        if (MyUtil.isNotNull(this.mCurrentEngineSetting.getNativeDbPath())) {
                                            MyLog.e(TAG, "初始化离线引擎失败, native db not exists");
                                        } else {
                                            MyLog.e(TAG, "初始化离线引擎失败, native db not exists");
                                        }
                                        if (MyUtil.isNotNull(this.mCurrentEngineSetting.getNativeCNResourcePath())) {
                                        }
                                        MyLog.e(TAG, "初始化离线引擎失败, native_cn not exists");
                                        if (!z11) {
                                            MyLog.e(TAG, "初始化离线引擎失败, all native not exists");
                                            Message message10 = new Message();
                                            message10.what = 3;
                                            message10.obj = "all native not exists";
                                            this.mHandler.sendMessage(message10);
                                            LogCat.pushLog(this.mContext);
                                            this.isInitializing = false;
                                            return;
                                        }
                                        MyLog.e(TAG, "初始化参数cfg===>" + jSONObject.toString().replace(str2, BuildConfig.VERSION_NAME));
                                        this.mCurrentEngine = "native";
                                        if (SkEgn.isLibraryLoaded()) {
                                            this.engine = SkEgn.skegn_new(jSONObject.toString(), getContext());
                                            MyLog.e(TAG, "native engine:" + String.valueOf(this.engine));
                                            if (this.engine != 0) {
                                                MyLog.e(TAG, "初始化引擎成功");
                                                this.mHandler.sendEmptyMessage(2);
                                            } else {
                                                MyLog.e(TAG, "初始化引擎失败");
                                                int iSkegn_get_last_error4 = SkEgn.skegn_get_last_error();
                                                Message message11 = new Message();
                                                message11.what = 3;
                                                message11.obj = "error:" + String.valueOf(iSkegn_get_last_error4);
                                                this.mHandler.sendMessage(message11);
                                                LogCat.pushLog(this.mContext);
                                            }
                                        } else {
                                            MyLog.e(TAG, "初始化引擎失败");
                                            Message message12 = new Message();
                                            message12.what = 3;
                                            message12.obj = "error: so库加载失败";
                                            this.mHandler.sendMessage(message12);
                                            LogCat.pushLog(this.mContext);
                                        }
                                    }
                                }
                            } catch (Exception e13) {
                                e13.printStackTrace();
                            }
                        } catch (Exception e14) {
                            e14.printStackTrace();
                            MyLog.e(TAG, "初始化引擎失败");
                            Message message13 = new Message();
                            message13.what = 3;
                            message13.obj = e14.getMessage();
                            this.mHandler.sendMessage(message13);
                            LogCat.pushLog(this.mContext);
                        }
                    } catch (Exception e15) {
                        MyLog.e(TAG, "初始化引擎失败");
                        Message message14 = new Message();
                        message14.what = 3;
                        message14.obj = e15.getMessage();
                        this.mHandler.sendMessage(message14);
                        e15.printStackTrace();
                        LogCat.pushLog(this.mContext);
                    }
                }
                this.isInitializing = false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void playback() {
        MyLog.e(TAG, EHjhWcesDUIsIw.jCfrVjluA);
        STRecorder sTRecorder = this.recorder;
        if (sTRecorder != null) {
            sTRecorder.playback(this.mHandler);
            return;
        }
        Message message = new Message();
        message.what = 16;
        message.obj = "recording is required before playing";
        this.mHandler.sendMessage(message);
        LogCat.pushLog(this.mContext);
    }

    @Deprecated
    public void existsAudioTrans(RecordSetting recordSetting, OnRecordListener onRecordListener, Integer num, Integer num2) {
        this.mOnRecordListener = onRecordListener;
        existsAudioTrans(recordSetting, num, num2);
    }

    @Deprecated
    public void startRecord(String str, String str2, int i11, OnRecordListener onRecordListener) {
        RecordSetting recordSetting = new RecordSetting(str, i11);
        recordSetting.setRefText(str2);
        startRecord(recordSetting, onRecordListener);
    }

    public void feed(byte[] bArr, int i11) {
        STRecorderExternal sTRecorderExternal = this.recorderExternal;
        if (sTRecorderExternal == null || this.status1 != engine_status.RECORDING || this.isAudioFileEval || i11 <= 0) {
            return;
        }
        try {
            sTRecorderExternal.feed(bArr, i11);
            SkEgn.skegn_feed(this.engine, bArr, i11);
        } catch (Exception e8) {
            MyLog.e(TAG, "exception", e8);
        }
    }

    public boolean updateProvision(String str, String str2) {
        MyLog.e(TAG, "===>updateProvision");
        return SkEgn.skegn_update_provision(null, str, str2, this.mContext) == 0;
    }

    public void existsAudioTrans(RecordSetting recordSetting, OnRecorderListener onRecorderListener) {
        this.mOnRecorderListener = onRecorderListener;
        existsAudioTrans(recordSetting);
    }

    public boolean inquireProvision(InquireProvisionCallback inquireProvisionCallback) {
        return inquireProvision(null, inquireProvisionCallback);
    }

    private void startRecord(final RecordSetting recordSetting) {
        int iSkegn_start;
        MyLog.e(TAG, "===>startRecord");
        try {
            if (!MyUtil.isNull(this.mCurrentEngine) && this.engine != 0) {
                engine_status engine_statusVar = this.status1;
                engine_status engine_statusVar2 = engine_status.RECORDING;
                if (engine_statusVar != engine_statusVar2 && !this.isRetrying) {
                    this.isRetrying = false;
                    this.isRecordCancel = false;
                    this.isAudioFileEval = false;
                    this.isAudioFileEvalFirst = false;
                    this.resultBuffer = BuildConfig.VERSION_NAME;
                    this.recordedPath = BuildConfig.VERSION_NAME;
                    String strReplace = null;
                    this.mCurrentRecordSetting = null;
                    this.evalCount = 0;
                    if (recordSetting == null) {
                        MyLog.e(TAG, "RecordSetting instance is required!");
                        Message message = new Message();
                        message.what = 11;
                        message.obj = "RecordSetting instance is required!";
                        this.mHandler.sendMessage(message);
                        return;
                    }
                    this.mCurrentRecordSetting = recordSetting;
                    this.autoRetryErrIds = recordSetting.getErrIds();
                    if (recordSetting.isMuteMusic()) {
                        DeviceUtils.muteAudioFocus(getContext(), true);
                    }
                    if (recordSetting.getIsStream()) {
                        this.recorderExternal = new STRecorderExternal();
                    } else {
                        STRecorder sTRecorder = STRecorder.getInstance(getContext(), recordSetting.getAudioType(), recordSetting.getChunkSize(), recordSetting.getAudioSource());
                        this.recorder = sTRecorder;
                        sTRecorder.setHandler(this.mHandler);
                        this.recorder.setbMute(recordSetting.isMuteMusic());
                    }
                    String recordFilePath = recordSetting.getRecordFilePath();
                    String recordName = recordSetting.getRecordName();
                    String audioType = recordSetting.getAudioType();
                    if (!recordSetting.getIsStream()) {
                        recordSetting.setAudioType(AudioType.WAV);
                    }
                    initParams(recordSetting);
                    byte[] bArr = new byte[64];
                    try {
                        MyLog.e(TAG, "===>skegn_start");
                        try {
                            iSkegn_start = SkEgn.skegn_start(this.engine, this.params.toString(), bArr, mkCallback(), getContext());
                            bArr = bArr;
                        } catch (Exception e8) {
                            e = e8;
                            bArr = bArr;
                            MyLog.e(TAG, "===>ST Exception");
                            e.printStackTrace();
                            iSkegn_start = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            bArr = bArr;
                            MyLog.e(TAG, "===>ST Exception");
                            th.printStackTrace();
                            iSkegn_start = 0;
                        }
                    } catch (Exception e10) {
                        e = e10;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    this.params = null;
                    if (iSkegn_start == -1) {
                        String str = "skegn_start failed, error:" + String.valueOf(SkEgn.skegn_get_last_error());
                        MyLog.e(TAG, str);
                        Message message2 = new Message();
                        message2.what = 11;
                        message2.obj = str;
                        this.mHandler.sendMessage(message2);
                        cancel();
                        LogCat.pushLog(this.mContext);
                        return;
                    }
                    this.status1 = engine_status.RECORDING;
                    try {
                        MyLog.e(TAG, "id:" + new String(bArr).trim());
                    } catch (Exception e11) {
                        MyLog.e(TAG, "===>ST Exception");
                        e11.printStackTrace();
                    }
                    if (recordFilePath.isEmpty()) {
                        recordFilePath = AiUtil.getFilesDir(getContext()).getPath() + "/record/";
                    }
                    if (MyUtil.isNull(recordName)) {
                        if (MyUtil.isNull(audioType)) {
                            audioType = AudioType.WAV;
                        }
                        recordName = new String(bArr).trim() + "." + audioType;
                    }
                    String strD = a.D(recordFilePath, "/", recordName);
                    this.mp3Path = BuildConfig.VERSION_NAME;
                    MyLog.e(TAG, "audioType===>" + audioType);
                    if (!recordSetting.getIsStream() && audioType.equals(AudioType.MP3)) {
                        MyLog.e(TAG, "set mp3 audio");
                        strD = strD.replace(".mp3", ".wav");
                        strReplace = strD.replace(".wav", ".mp3");
                        this.mp3Path = strReplace;
                        this.recorder.setMp3Path(strReplace);
                    }
                    MyLog.e(TAG, "mp3Path===>" + strReplace);
                    MyLog.e(TAG, "wavPath===>" + strD);
                    this.recordedPath = strD;
                    MyLog.e(TAG, "===>set recordedPath:" + this.recordedPath);
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.sendEmptyMessage(5);
                        this.mHandler.sendEmptyMessage(10);
                    }
                    if (recordSetting.getIsStream()) {
                        try {
                            this.recorderExternal.start(strD);
                            return;
                        } catch (Exception e12) {
                            MyLog.e(TAG, "exception", e12);
                            return;
                        }
                    }
                    this.recorder.setOnSTRecorderListener(new OnSTRecorderListener() { // from class: com.stkouyu.SkEgnManager.3
                        @Override // com.stkouyu.listener.OnSTRecorderListener
                        public void onStart() {
                            RecordSetting recordSetting2 = recordSetting;
                            if (recordSetting2 == null || recordSetting2.getDuration() == null) {
                                return;
                            }
                            if (recordSetting.getDuration().intValue() < 1000) {
                                MyLog.e(SkEgnManager.TAG, "duration should more than 1000");
                            }
                            if (SkEgnManager.this.status1 == engine_status.RECORDING) {
                                MyLog.e(SkEgnManager.TAG, "onstart=====>");
                                SkEgnManager.this.startRecordTimer(recordSetting.getDuration().intValue(), recordSetting.getDurationInterval().intValue());
                            }
                        }
                    });
                    this.isStopFeed = false;
                    this.recorder.start(strD, new STRecorder.Callback() { // from class: com.stkouyu.SkEgnManager.4
                        @Override // com.stkouyu.STRecorder.Callback
                        public void run(byte[] bArr2, int i11) {
                            if (SkEgnManager.this.isAudioFileEval || i11 < 0) {
                                return;
                            }
                            SkEgnManager skEgnManager = SkEgnManager.this;
                            if (skEgnManager.status1 == engine_status.RECORDING && !skEgnManager.isStopFeed) {
                                SkEgn.skegn_feed(SkEgnManager.this.engine, bArr2, i11);
                            }
                            if (SkEgnManager.this.mOnRecordBufferListener == null || SkEgnManager.this.mHandler == null) {
                                return;
                            }
                            Message message3 = new Message();
                            try {
                                message3.what = 9;
                                Bundle bundle = new Bundle();
                                bundle.putByteArray("buffer", bArr2);
                                bundle.putInt("size", i11);
                                message3.setData(bundle);
                                SkEgnManager.this.mHandler.sendMessage(message3);
                                MyLog.e(SkEgnManager.TAG, "audio buffer size===>" + i11);
                            } catch (Exception e13) {
                                MyLog.e(SkEgnManager.TAG, "===>ST Exception");
                                e13.printStackTrace();
                            }
                        }
                    });
                    return;
                }
                MyLog.e(TAG, "startRecord fail, wait last record end!");
                if (this.status1 == engine_statusVar2) {
                    Message message3 = new Message();
                    message3.what = 11;
                    message3.obj = "startRecord fail, wait last record end!";
                    this.mHandler.sendMessage(message3);
                }
                LogCat.pushLog(this.mContext);
                return;
            }
            MyLog.e(TAG, "skegn_start failed,engineType is null");
            Message message4 = new Message();
            message4.what = 11;
            message4.obj = "skegn_start failed,engineType is null";
            this.mHandler.sendMessage(message4);
            LogCat.pushLog(this.mContext);
        } catch (Exception e13) {
            e13.printStackTrace();
            LogCat.pushLog(this.mContext);
        }
    }

    public void existsAudioTrans(RecordSetting recordSetting, OnRecorderListener onRecorderListener, Integer num, Integer num2) {
        this.mOnRecorderListener = onRecorderListener;
        existsAudioTrans(recordSetting, num, num2);
    }

    private void existsAudioTrans(RecordSetting recordSetting, Integer num, Integer num2) {
        engine_status engine_statusVar;
        Handler handler;
        try {
            try {
                Integer num3 = num != null ? num : 4096;
                Integer num4 = num2 != null ? num2 : 50;
                MyLog.e(TAG, "existsAudioTrans");
                if (!this.isRetrying) {
                    this.evalCount = 0;
                    this.isAudioFileEvalFirst = true;
                }
                if (MyUtil.isNotNull(this.resultBuffer)) {
                    this.status1 = engine_status.RECORDING;
                }
                this.isAudioFileEval = true;
                this.isRecordCancel = false;
                if (recordSetting == null) {
                    MyLog.e(TAG, "RecordSetting instance is required!");
                    if (this.mHandler != null) {
                        Message message = new Message();
                        message.what = 11;
                        message.obj = "RecordSetting instance is required!";
                        this.mHandler.sendMessage(message);
                    }
                } else {
                    this.mCurrentRecordSetting = recordSetting;
                    this.autoRetryErrIds = recordSetting.getErrIds();
                    this.status1 = engine_status.RECORDING;
                    String str = recordSetting.getRecordFilePath() + "/" + recordSetting.getRecordName();
                    MyLog.e(TAG, "existsAudioTrans wavpath:" + str + ",recordedPath:" + this.recordedPath);
                    if (this.evalCount > 0 && MyUtil.isNotNull(this.recordedPath) && !this.isAudioFileEvalFirst) {
                        str = this.recordedPath;
                    }
                    if (MyUtil.isNull(str)) {
                        MyLog.e(TAG, "skegn_start failed: audioPath is null");
                        if (this.mHandler != null) {
                            Message message2 = new Message();
                            message2.what = 11;
                            message2.obj = "skegn_start failed: audioPath is null";
                            this.mHandler.sendMessage(message2);
                        }
                        if (MyUtil.isNotNull(this.resultBuffer) && this.isRetrying) {
                            flushResultBuffer();
                        }
                        this.isRetrying = false;
                        engine_statusVar = engine_status.STOP;
                        this.status1 = engine_statusVar;
                        LogCat.pushLog(this.mContext);
                    } else {
                        if (this.evalCount == 0 && (handler = this.mHandler) != null) {
                            handler.sendEmptyMessage(5);
                            this.mHandler.sendEmptyMessage(10);
                        }
                        File file = new File(str);
                        MyLog.e(TAG, "existsAudioTrans use audio path is: " + str);
                        if (file.exists() && file.isFile()) {
                            initParams(recordSetting);
                            int iSkegn_start = SkEgn.skegn_start(this.engine, this.params.toString(), new byte[OSSConstants.DEFAULT_BUFFER_SIZE], mkCallback(), getContext());
                            this.params = null;
                            if (iSkegn_start < 0) {
                                String str2 = "skegn_start failed, error:" + String.valueOf(SkEgn.skegn_get_last_error());
                                MyLog.e(TAG, str2);
                                if (this.mHandler != null) {
                                    Message message3 = new Message();
                                    message3.what = 11;
                                    message3.obj = str2;
                                    this.mHandler.sendMessage(message3);
                                }
                                cancel();
                            } else {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                                byte[] bArr = new byte[num3.intValue()];
                                while (true) {
                                    int i11 = bufferedInputStream.read(bArr);
                                    if (i11 == -1 || this.status1 != engine_status.RECORDING) {
                                        break;
                                    }
                                    SkEgn.skegn_feed(this.engine, bArr, i11);
                                    Thread.sleep(num4.intValue());
                                }
                                if (this.status1 == engine_status.RECORDING) {
                                    MyLog.e(TAG, "existsAudioTrans skegn_stop");
                                    if (this.evalCount == 0 && this.mHandler != null) {
                                        Message message4 = new Message();
                                        message4.what = 14;
                                        this.mHandler.sendMessage(message4);
                                    }
                                    SkEgn.skegn_stop(this.engine);
                                } else {
                                    MyLog.e(TAG, "existsAudioTrans skegn_cancel");
                                    SkEgn.skegn_cancel(this.engine);
                                }
                            }
                        }
                        String str3 = "skegn_start failed: audio file not exist, path is :" + str;
                        MyLog.e(TAG, str3);
                        if (this.mHandler != null) {
                            Message message5 = new Message();
                            message5.what = 11;
                            message5.obj = str3;
                            this.mHandler.sendMessage(message5);
                        }
                        if (MyUtil.isNotNull(this.resultBuffer) && this.isRetrying) {
                            flushResultBuffer();
                        }
                        this.isRetrying = false;
                        engine_statusVar = engine_status.STOP;
                        this.status1 = engine_statusVar;
                        LogCat.pushLog(this.mContext);
                    }
                    this.isRetrying = false;
                    this.status1 = engine_statusVar;
                }
            } catch (Exception e8) {
                MyLog.e(TAG, "===>ST Exception");
                e8.printStackTrace();
                LogCat.pushLog(this.mContext);
            }
            this.isRetrying = false;
            engine_statusVar = engine_status.STOP;
            this.status1 = engine_statusVar;
        } catch (Throwable th2) {
            this.isRetrying = false;
            this.status1 = engine_status.STOP;
            throw th2;
        }
    }

    public void startRecord(RecordSetting recordSetting, OnRecorderListener onRecorderListener) {
        this.mOnRecorderListener = onRecorderListener;
        startRecord(recordSetting);
    }

    @Deprecated
    public void startRecord(RecordSetting recordSetting, OnRecordListener onRecordListener) {
        this.mOnRecordListener = onRecordListener;
        startRecord(recordSetting);
    }
}
