package com.stkouyu.util;

import android.content.Context;
import com.stkouyu.AppConfig;
import com.stkouyu.SkEgn;
import java.io.File;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class MyUtil {
    public static String getSerialNumber(Context context, String str) {
        JSONObject jSONObject;
        JSONException e8;
        byte[] bArr = new byte[1024];
        StringBuilder sbI = c.i(SkEgn.skegn_get_device_id(bArr, context), "deviceId===>", ";buf===>");
        sbI.append(new String(bArr));
        MyLog.e("sss", sbI.toString());
        try {
            jSONObject = new JSONObject(str);
            try {
                jSONObject.put("deviceId", new String(bArr).trim());
            } catch (JSONException e10) {
                e8 = e10;
                e8.printStackTrace();
            }
        } catch (JSONException e11) {
            jSONObject = null;
            e8 = e11;
        }
        byte[] bArrCopyOf = Arrays.copyOf(jSONObject.toString().getBytes(), 1024);
        int iSkegn_opt = SkEgn.skegn_opt(0L, 6, bArrCopyOf, 1024);
        return iSkegn_opt > 0 ? new String(bArrCopyOf, 0, iSkegn_opt) : new String(bArrCopyOf);
    }

    public static boolean isExistsProvisionFileInDD(Context context) {
        for (File file : context.getExternalFilesDir(null).listFiles()) {
            if (AppConfig.PROVISION.equals(file.getName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNotNull(String str) {
        return !isNull(str);
    }

    public static boolean isNull(String str) {
        return str == null || str.length() == 0;
    }
}
