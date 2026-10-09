package okhttp3.internal.platform.android;

import android.util.Log;
import com.lingodeer.data.model.AchievementLevelType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.m;
import okhttp3.OkHttpClient;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;
import oz.q;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AndroidLog f45535a = new AndroidLog();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArraySet f45536b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f45537c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r9 = OkHttpClient.class.getPackage();
        String name = r9 != null ? r9.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Http2.class.getName(), "okhttp.Http2");
        linkedHashMap.put(TaskRunner.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f45537c = x.h0(linkedHashMap);
    }

    private AndroidLog() {
    }

    public static void a(String str, int i11, String str2, Throwable th2) {
        int iMin;
        String strG1 = (String) f45537c.get(str);
        if (strG1 == null) {
            strG1 = q.g1(23, str);
        }
        if (Log.isLoggable(strG1, i11)) {
            if (th2 != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th2);
            }
            int length = str2.length();
            int i12 = 0;
            while (i12 < length) {
                int iH0 = q.H0(str2, '\n', i12, 4);
                if (iH0 == -1) {
                    iH0 = length;
                }
                while (true) {
                    iMin = Math.min(iH0, i12 + AchievementLevelType.XP_LV_6);
                    String strSubstring = str2.substring(i12, iMin);
                    m.e(strSubstring, "substring(...)");
                    Log.println(i11, strG1, strSubstring);
                    if (iMin >= iH0) {
                        break;
                    } else {
                        i12 = iMin;
                    }
                }
                i12 = iMin + 1;
            }
        }
    }
}
