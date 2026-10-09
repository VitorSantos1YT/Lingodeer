package com.stkouyu.util;

import android.content.Context;
import android.media.AudioManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class DeviceUtils {
    public static boolean hasFroyo() {
        return true;
    }

    public static boolean muteAudioFocus(Context context, boolean z11) {
        boolean z12 = false;
        if (context == null) {
            MyLog.d("17kouyu", "context is null.");
            return false;
        }
        if (!hasFroyo()) {
            MyLog.d("17kouyu", "Android 2.1 and below can not stop music");
            return false;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (!z11 ? audioManager.abandonAudioFocus(null) == 1 : audioManager.requestAudioFocus(null, 3, 2) == 1) {
            z12 = true;
        }
        MyLog.d("17kouyu", "pauseMusic isFocous=" + z11 + " result=" + z12);
        return z12;
    }

    public static final boolean ping() {
        try {
            Process processExec = Runtime.getRuntime().exec("ping -c 3 -w 10 ping.stkouyu.com");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                stringBuffer.append(line);
            }
            return processExec.waitFor() == 0;
        } catch (IOException | InterruptedException | Exception unused) {
            return false;
        }
    }
}
