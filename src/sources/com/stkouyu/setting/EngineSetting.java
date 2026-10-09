package com.stkouyu.setting;

import android.content.Context;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.stkouyu.AppConfig;
import com.stkouyu.listener.OnInitEngineListener;
import com.stkouyu.util.AiUtil;
import com.stkouyu.util.MyLog;
import com.stkouyu.util.MyUtil;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class EngineSetting {
    private static final String TAG = "17kouyu";
    private static EngineSetting mEngineSetting = null;
    private static String native_cn_res_path2 = "%s/native_cn.res";
    private static String native_res_path2 = "%s/native.res";
    private boolean isNeedUpdateOnlineProvision;
    private boolean isUseOnlineProvision;
    private Context mContext;
    private OnInitEngineListener onInitEngineListener;
    public File provisionFile;
    private String provisionPath;
    private String serverAddress = BuildConfig.VERSION_NAME;
    private String serverList = BuildConfig.VERSION_NAME;
    private int connectTimeout = 10;
    private int serverTimeout = 60;
    private String nativeResourcePath = BuildConfig.VERSION_NAME;
    private String nativeDbPath = BuildConfig.VERSION_NAME;
    private boolean isVADEnabled = false;
    private int vadSeek = 60;
    private boolean isSDKLogEnabled = true;
    private String userId = "userId";
    private String sdkCfgAddr = null;
    private String engineType = null;
    private int logLevel = 3;
    private String nativeCNResourcePath = BuildConfig.VERSION_NAME;
    private boolean autoDetectNetwork = false;
    private boolean enableUploadLog = false;
    private boolean enableSaveLogCatToFile = false;

    public EngineSetting(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private Context getContext() {
        return this.mContext;
    }

    public static EngineSetting getDefaultCloudInstance(Context context) {
        EngineSetting engineSetting = new EngineSetting(context);
        engineSetting.setConnectTimeout(10).setServerTimeout(60).setVADEnabled(false).setVadSeek(60).setSDKLogEnabled(true);
        return engineSetting;
    }

    public static EngineSetting getDefaultNativeInstance(Context context) {
        EngineSetting engineSetting = new EngineSetting(context);
        engineSetting.setVADEnabled(false).setVadSeek(60).setSDKLogEnabled(true);
        try {
            engineSetting.setNativeResourcePath(String.format(native_res_path2, new String(AiUtil.unzipFile(context, bjXGJ.sOzpyUAaBlC).toString())));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        File file = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open(AppConfig.PROVISION);
            File file2 = new File(AiUtil.externalFilesDir(context), AppConfig.PROVISION);
            AiUtil.writeToFile(file2, inputStreamOpen);
            inputStreamOpen.close();
            file = file2;
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (file == null) {
            MyLog.e(TAG, "provision file is null!");
        } else {
            engineSetting.setProvisionPath(file.getAbsolutePath());
        }
        return engineSetting;
    }

    public static EngineSetting getInstance(Context context) {
        EngineSetting engineSetting = mEngineSetting;
        if (engineSetting != null) {
            return engineSetting;
        }
        EngineSetting engineSetting2 = new EngineSetting(context);
        mEngineSetting = engineSetting2;
        return engineSetting2;
    }

    private int getVadSeek() {
        return this.vadSeek;
    }

    private EngineSetting setVadSeek(int i11) {
        this.vadSeek = i11;
        return this;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public File getDefaultProvisionFile() {
        try {
            InputStream inputStreamOpen = getContext().getAssets().open(AppConfig.PROVISION);
            File file = new File(AiUtil.externalFilesDir(getContext()), AppConfig.PROVISION);
            AiUtil.writeToFile(file, inputStreamOpen);
            inputStreamOpen.close();
            return file;
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public boolean getEnableSaveLogCatToFile() {
        return this.enableSaveLogCatToFile;
    }

    public boolean getEnableUploadLog() {
        return this.enableUploadLog;
    }

    public String getEngineType() {
        return this.engineType;
    }

    public int getLogLevel() {
        return this.logLevel;
    }

    public String getNativeCNResourcePath() {
        if (MyUtil.isNull(this.nativeCNResourcePath)) {
            this.nativeCNResourcePath = String.format(native_cn_res_path2, new String(AiUtil.unzipFileCN(getContext(), "native_cn.zip").toString()));
        }
        return this.nativeCNResourcePath;
    }

    public String getNativeDbPath() {
        if (MyUtil.isNull(this.nativeDbPath)) {
            this.nativeDbPath = new String(AiUtil.copyDb2SD(getContext(), "native.db").toString()).concat("/native.db");
        }
        return this.nativeDbPath;
    }

    public String getNativeResourcePath() {
        if (MyUtil.isNull(this.nativeResourcePath)) {
            this.nativeResourcePath = String.format(native_res_path2, new String(AiUtil.unzipFile(getContext(), "native.zip").toString()));
        }
        return this.nativeResourcePath;
    }

    public OnInitEngineListener getOnInitEngineListener() {
        return this.onInitEngineListener;
    }

    public String getProvisionPath() {
        File file;
        try {
            if (MyUtil.isNull(this.provisionPath)) {
                this.provisionPath = getDefaultProvisionFile().getAbsolutePath();
            } else {
                try {
                    file = new File(this.provisionPath);
                } catch (Exception e8) {
                    e8.printStackTrace();
                    file = null;
                }
                if (file == null || !file.exists()) {
                    this.provisionPath = getDefaultProvisionFile().getAbsolutePath();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return this.provisionPath;
    }

    public String getSdkCfgAddr() {
        return this.sdkCfgAddr;
    }

    public String getServerAddress() {
        return this.serverAddress;
    }

    public String getServerList() {
        return this.serverList;
    }

    public int getServerTimeout() {
        return this.serverTimeout;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isAutoDetectNetwork() {
        return this.autoDetectNetwork;
    }

    public boolean isNeedUpdateOnlineProvision() {
        return this.isNeedUpdateOnlineProvision;
    }

    public boolean isSDKLogEnabled() {
        return this.isSDKLogEnabled;
    }

    public boolean isUseOnlineProvision() {
        return this.isUseOnlineProvision;
    }

    public boolean isVADEnabled() {
        return this.isVADEnabled;
    }

    public void setAutoDetectNetwork(boolean z11) {
        this.autoDetectNetwork = z11;
    }

    public EngineSetting setConnectTimeout(int i11) {
        this.connectTimeout = i11;
        return this;
    }

    public void setEnableSaveLogCatToFile(boolean z11) {
        this.enableSaveLogCatToFile = z11;
    }

    public void setEnableUploadLog(boolean z11) {
        this.enableUploadLog = z11;
    }

    public void setEngineType(String str) {
        this.engineType = str;
    }

    public void setLogLevel(int i11) {
        this.logLevel = i11;
    }

    public EngineSetting setNativeCNResourcePath(String str) {
        this.nativeCNResourcePath = str;
        return this;
    }

    public EngineSetting setNativeDbPath(String str) {
        this.nativeDbPath = str;
        return this;
    }

    public EngineSetting setNativeResourcePath(String str) {
        this.nativeResourcePath = str;
        return this;
    }

    public EngineSetting setNeedUpdateOnlineProvision(boolean z11) {
        this.isNeedUpdateOnlineProvision = z11;
        return this;
    }

    public EngineSetting setOnInitEngineListener(OnInitEngineListener onInitEngineListener) {
        this.onInitEngineListener = onInitEngineListener;
        return this;
    }

    public EngineSetting setProvisionPath(String str) {
        this.provisionPath = str;
        return this;
    }

    public EngineSetting setSDKLogEnabled(boolean z11) {
        this.isSDKLogEnabled = z11;
        return this;
    }

    public EngineSetting setSdkCfgAddr(String str) {
        this.sdkCfgAddr = str;
        return this;
    }

    public EngineSetting setServerAddress(String str) {
        this.serverAddress = str;
        return this;
    }

    public EngineSetting setServerList(String str) {
        this.serverList = str;
        return this;
    }

    public EngineSetting setServerTimeout(int i11) {
        this.serverTimeout = i11;
        return this;
    }

    public EngineSetting setUseOnlineProvision(boolean z11) {
        this.isUseOnlineProvision = z11;
        return this;
    }

    public EngineSetting setUserId(String str) {
        if (str != null && !BuildConfig.VERSION_NAME.equals(str)) {
            this.userId = str;
        }
        return this;
    }

    public EngineSetting setVADEnabled(boolean z11) {
        this.isVADEnabled = z11;
        return this;
    }

    public EngineSetting getDefaultCloudInstance() {
        return getDefaultCloudInstance(getContext());
    }

    public EngineSetting getDefaultNativeInstance() {
        return getDefaultNativeInstance(getContext());
    }
}
