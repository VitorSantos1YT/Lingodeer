package te;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ef.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import ns.o;
import nv.p;
import oz.q;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f52128a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f52129b;

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void a(HashMap map, String str, String str2) {
        List listK;
        HashMap map2 = d.f52135e;
        switch (str.hashCode()) {
            case 3585:
                if (str.equals("r3")) {
                    str2 = (!x.s0(str2, "m", false) && !x.s0(str2, "b", false) && !x.s0(str2, "ge", false)) ? "f" : "m";
                }
                break;
            case 3586:
                if (str.equals("r4")) {
                    str2 = p.s("[^a-z]+", "compile(...)", str2, BuildConfig.VERSION_NAME, "replaceAll(...)");
                }
                break;
            case 3587:
                if (str.equals("r5")) {
                    str2 = p.s("[^a-z]+", "compile(...)", str2, BuildConfig.VERSION_NAME, "replaceAll(...)");
                }
                break;
            case 3588:
                if (str.equals("r6") && q.v0(str2, "-", false)) {
                    Matcher matcherW = p.w(0, "-", "compile(...)", str2);
                    if (matcherW.find()) {
                        ArrayList arrayList = new ArrayList(10);
                        int iC = 0;
                        do {
                            iC = p.c(matcherW, str2, iC, arrayList);
                        } while (matcherW.find());
                        p.B(iC, str2, arrayList);
                        listK = arrayList;
                    } else {
                        listK = o.K(str2.toString());
                    }
                    str2 = ((String[]) listK.toArray(new String[0]))[0];
                }
                break;
        }
        map.put(str, str2);
    }

    public static void b(Activity activity) {
        View viewS;
        int iHashCode = activity.hashCode();
        HashMap map = null;
        if (!qf.a.b(d.class)) {
            try {
                map = d.f52135e;
            } catch (Throwable th2) {
                qf.a.a(d.class, th2);
            }
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object dVar = map.get(numValueOf);
        if (dVar == null) {
            dVar = new d(activity);
            map.put(numValueOf, dVar);
        }
        d dVar2 = (d) dVar;
        if (qf.a.b(d.class)) {
            return;
        }
        try {
            if (!qf.a.b(dVar2)) {
                try {
                    if (!dVar2.f52139d.getAndSet(true) && (viewS = e.s((Activity) dVar2.f52138c.get())) != null) {
                        ViewTreeObserver viewTreeObserver = viewS.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalFocusChangeListener(dVar2);
                        }
                    }
                } catch (Throwable th3) {
                    qf.a.a(dVar2, th3);
                }
            }
        } catch (Throwable th4) {
            qf.a.a(d.class, th4);
        }
    }
}
