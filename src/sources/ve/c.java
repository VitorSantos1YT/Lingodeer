package ve;

import android.os.Bundle;
import android.view.View;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f53978a = new c();

    public static Bundle b(we.c cVar, View view, View view2) {
        Bundle bundle = new Bundle();
        List<we.d> listUnmodifiableList = Collections.unmodifiableList(cVar.f55097c);
        m.e(listUnmodifiableList, "unmodifiableList(parameters)");
        for (we.d dVar : listUnmodifiableList) {
            String str = dVar.f55100b;
            String str2 = dVar.f55099a;
            ArrayList arrayList = dVar.f55101c;
            if (str != null && str.length() > 0) {
                bundle.putString(str2, dVar.f55100b);
            } else if (arrayList.size() > 0) {
                int i11 = 0;
                ArrayList arrayListO = m.a(dVar.f55102d, "relative") ? i.o(view2, arrayList, 0, -1, view2.getClass().getSimpleName()) : i.o(view, arrayList, 0, -1, view.getClass().getSimpleName());
                int size = arrayListO.size();
                while (i11 < size) {
                    Object obj = arrayListO.get(i11);
                    i11++;
                    e eVar = (e) obj;
                    if (eVar.a() != null) {
                        String strI = we.h.i(eVar.a());
                        if (strI.length() > 0) {
                            bundle.putString(str2, strI);
                            break;
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static final void c(we.c cVar, View view, View view2) {
        if (qf.a.b(c.class)) {
            return;
        }
        try {
            String str = cVar.f55095a;
            Bundle bundleB = b(cVar, view, view2);
            f53978a.d(bundleB);
            s.d().execute(new pb.b(19, str, bundleB));
        } catch (Throwable th2) {
            qf.a.a(c.class, th2);
        }
    }

    public synchronized g a() {
        g gVar;
        g gVar2;
        try {
            gVar = null;
            if (qf.a.b(g.class)) {
                gVar2 = null;
            } else {
                try {
                    gVar2 = g.f53994g;
                } catch (Throwable th2) {
                    qf.a.a(g.class, th2);
                    gVar2 = null;
                }
            }
            if (gVar2 == null) {
                g gVar3 = new g();
                if (!qf.a.b(g.class)) {
                    try {
                        g.f53994g = gVar3;
                    } catch (Throwable th3) {
                        qf.a.a(g.class, th3);
                    }
                }
            }
            if (!qf.a.b(g.class)) {
                try {
                    gVar = g.f53994g;
                } catch (Throwable th4) {
                    qf.a.a(g.class, th4);
                }
            }
            m.d(gVar, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
        } catch (Throwable th5) {
            throw th5;
        }
        return gVar;
    }

    public void d(Bundle bundle) {
        Locale locale;
        if (qf.a.b(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                double dDoubleValue = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String strGroup = matcher.group(0);
                        try {
                            locale = s.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            m.e(locale, "getDefault()");
                        }
                        dDoubleValue = NumberFormat.getNumberInstance(locale).parse(strGroup).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                bundle.putDouble("_valueToSum", dDoubleValue);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
