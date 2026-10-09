package jf;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import ns.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import we.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f36319a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f36320b = o.L(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    public static final ArrayList a(View view) {
        if (qf.a.b(c.class)) {
            return null;
        }
        try {
            m.f(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator it = f36320b.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            ArrayList arrayListA = h.a(view);
            int size = arrayListA.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListA.get(i11);
                i11++;
                arrayList.addAll(a((View) obj));
            }
            return arrayList;
        } catch (Throwable th2) {
            qf.a.a(c.class, th2);
            return null;
        }
    }

    public static final JSONObject b(View view, View view2) {
        if (qf.a.b(c.class)) {
            return null;
        }
        try {
            m.f(view, "view");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayListA = h.a(view);
            int size = arrayListA.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListA.get(i11);
                i11++;
                jSONArray.put(b((View) obj, view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            qf.a.a(c.class, th2);
            return null;
        }
    }

    public static final String d(View hostView) {
        if (qf.a.b(c.class)) {
            return null;
        }
        try {
            m.f(hostView, "hostView");
            String strI = h.i(hostView);
            if (strI.length() > 0) {
                return strI;
            }
            String strJoin = TextUtils.join(" ", f36319a.c(hostView));
            m.e(strJoin, "join(\" \", childrenText)");
            return strJoin;
        } catch (Throwable th2) {
            qf.a.a(c.class, th2);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        if (qf.a.b(c.class)) {
            return;
        }
        try {
            m.f(view, "view");
            try {
                String strI = h.i(view);
                String strG = h.g(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", h.b(view));
                if (strI.length() > 0) {
                    jSONObject.put("text", strI);
                }
                if (strG.length() > 0) {
                    jSONObject.put("hint", strG);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            qf.a.a(c.class, th2);
        }
    }

    public final ArrayList c(View view) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListA = h.a(view);
            int size = arrayListA.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListA.get(i11);
                i11++;
                View view2 = (View) obj;
                String strI = h.i(view2);
                if (strI.length() > 0) {
                    arrayList.add(strI);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }
}
