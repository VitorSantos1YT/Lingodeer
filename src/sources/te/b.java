package te;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import ns.o;
import oz.q;
import we.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f52130a = new b();

    public static final ArrayList a(View view) {
        List listK;
        if (qf.a.b(b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(h.g(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            int i11 = 0;
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    m.e(resourceName, "resourceName");
                    Pattern patternCompile = Pattern.compile("/");
                    m.e(patternCompile, "compile(...)");
                    q.U0(0);
                    Matcher matcher = patternCompile.matcher(resourceName);
                    if (matcher.find()) {
                        ArrayList arrayList2 = new ArrayList(10);
                        int iEnd = 0;
                        do {
                            arrayList2.add(resourceName.subSequence(iEnd, matcher.start()).toString());
                            iEnd = matcher.end();
                        } while (matcher.find());
                        arrayList2.add(resourceName.subSequence(iEnd, resourceName.length()).toString());
                        listK = arrayList2;
                    } else {
                        listK = o.K(resourceName.toString());
                    }
                    String[] strArr = (String[]) listK.toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                String str = (String) obj;
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    m.e(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList3.add(lowerCase);
                }
            }
            return arrayList3;
        } catch (Throwable th2) {
            qf.a.a(b.class, th2);
            return null;
        }
    }

    public static final boolean c(ArrayList indicators, ArrayList keys) {
        if (!qf.a.b(b.class)) {
            try {
                m.f(indicators, "indicators");
                m.f(keys, "keys");
                int size = indicators.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = indicators.get(i11);
                    i11++;
                    String str = (String) obj;
                    b bVar = f52130a;
                    if (!qf.a.b(bVar)) {
                        try {
                            int size2 = keys.size();
                            int i12 = 0;
                            while (i12 < size2) {
                                Object obj2 = keys.get(i12);
                                i12++;
                                if (q.v0(str, (String) obj2, false)) {
                                    return true;
                                }
                            }
                        } catch (Throwable th2) {
                            qf.a.a(bVar, th2);
                        }
                    }
                }
            } catch (Throwable th3) {
                qf.a.a(b.class, th3);
                return false;
            }
        }
        return false;
    }

    public final ArrayList b(View view) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    String lowerCase = string.toLowerCase();
                    m.e(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                ArrayList arrayListA = h.a(view);
                int size = arrayListA.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayListA.get(i11);
                    i11++;
                    arrayList.addAll(b((View) obj));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }
}
