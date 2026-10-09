package we;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import lf.j1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import re.s;
import z4.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f55112a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f55113b = new WeakReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f55114c;

    public static final ArrayList a(View view) {
        if (qf.a.b(h.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i11));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0050 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:16:0x0027, B:19:0x0030, B:28:0x0047, B:33:0x0050, B:41:0x0060, B:39:0x005b, B:26:0x0041, B:23:0x003b), top: B:84:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0057  */
    /* JADX WARN: Code duplicated, block: B:41:0x0060 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:16:0x0027, B:19:0x0030, B:28:0x0047, B:33:0x0050, B:41:0x0060, B:39:0x005b, B:26:0x0041, B:23:0x003b), top: B:84:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0088 A[PHI: r3
      0x0088: PHI (r3v15 int) = (r3v14 int), (r3v16 int) binds: [B:48:0x0074, B:53:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static final int b(View view) {
        Class<?> cls;
        Class cls2;
        int i11;
        if (qf.a.b(h.class)) {
            return 0;
        }
        try {
            m.f(view, "view");
            int i12 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i12 |= 32;
            }
            boolean zB = qf.a.b(h.class);
            h hVar = f55112a;
            if (!zB) {
                try {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof AdapterView)) {
                        if (qf.a.b(hVar)) {
                            cls = null;
                            if (cls != null || !cls.isInstance(parent)) {
                                cls2 = qf.a.b(hVar) ? null : q.class;
                                if (cls2 != null && cls2.isInstance(parent)) {
                                }
                            }
                        } else {
                            try {
                                cls = Class.forName("android.support.v4.view.NestedScrollingChild");
                            } catch (ClassNotFoundException unused) {
                                cls = null;
                            } catch (Throwable th2) {
                                qf.a.a(hVar, th2);
                                cls = null;
                            }
                            if (cls != null) {
                                if (qf.a.b(hVar)) {
                                }
                                if (cls2 != null) {
                                }
                            } else {
                                if (qf.a.b(hVar)) {
                                }
                                if (cls2 != null) {
                                }
                            }
                        }
                    }
                    i12 |= 512;
                } catch (Throwable th3) {
                    qf.a.a(h.class, th3);
                }
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    if (view instanceof RatingBar) {
                        return i12 | 65536;
                    }
                    if (view instanceof RadioGroup) {
                        return i12 | 16384;
                    }
                    return ((view instanceof ViewGroup) && hVar.l(view, (View) f55113b.get())) ? i12 | 64 : i12;
                }
                return i12 | 4096;
            }
            int i13 = i12 | 1025;
            if (view instanceof Button) {
                i13 = i12 | 1029;
                if (view instanceof Switch) {
                    i11 = i12 | 9221;
                } else if (view instanceof CheckBox) {
                    i11 = i12 | 33797;
                } else {
                    i11 = i13;
                }
            } else {
                i11 = i13;
            }
            return view instanceof EditText ? i11 | 2048 : i11;
        } catch (Throwable th4) {
            qf.a.a(h.class, th4);
            return 0;
        }
    }

    public static final JSONObject c(View view) {
        if (qf.a.b(h.class)) {
            return null;
        }
        try {
            m.f(view, "view");
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                f55113b = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListA = a(view);
                int size = arrayListA.size();
                for (int i11 = 0; i11 < size; i11++) {
                    jSONArray.put(c((View) arrayListA.get(i11)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
            return null;
        }
    }

    public static final View.OnClickListener e(View view) {
        Field declaredField;
        if (qf.a.b(h.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            m.d(obj2, "null cannot be cast to non-null type android.view.View.OnClickListener");
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
            return null;
        }
    }

    public static final View.OnTouchListener f(View view) {
        Field declaredField;
        try {
            if (!qf.a.b(h.class)) {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj != null && (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) != null) {
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(obj);
                        m.d(obj2, "null cannot be cast to non-null type android.view.View.OnTouchListener");
                        return (View.OnTouchListener) obj2;
                    }
                } catch (ClassNotFoundException unused) {
                    s sVar = s.f49201a;
                } catch (IllegalAccessException unused2) {
                    s sVar2 = s.f49201a;
                } catch (NoSuchFieldException unused3) {
                    s sVar3 = s.f49201a;
                }
            }
            return null;
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
            return null;
        }
    }

    public static final String g(View view) {
        CharSequence hint;
        String string;
        if (qf.a.b(h.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return (hint == null || (string = hint.toString()) == null) ? BuildConfig.VERSION_NAME : string;
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
            return null;
        }
    }

    public static final ViewGroup h(View view) {
        if (!qf.a.b(h.class)) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    return (ViewGroup) parent;
                }
            } catch (Throwable th2) {
                qf.a.a(h.class, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f6 A[EDGE_INSN: B:42:0x00f6->B:43:0x00f7 BREAK  A[LOOP:0: B:32:0x00ca->B:38:0x00e4]] */
    public static final String i(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (qf.a.b(h.class)) {
            return null;
        }
        try {
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner)) {
                    if (!(view instanceof DatePicker)) {
                        if (!(view instanceof TimePicker)) {
                            if (!(view instanceof RadioGroup)) {
                                if (!(view instanceof RatingBar)) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                            } else {
                                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                                int childCount = ((RadioGroup) view).getChildCount();
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= childCount) {
                                        charSequenceValueOf = null;
                                        break;
                                    }
                                    View childAt = ((RadioGroup) view).getChildAt(i11);
                                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                        charSequenceValueOf = ((RadioButton) childAt).getText();
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        } else {
                            Integer currentHour = ((TimePicker) view).getCurrentHour();
                            m.e(currentHour, "view.currentHour");
                            int iIntValue = currentHour.intValue();
                            Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                            m.e(currentMinute, "view.currentMinute");
                            charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(currentMinute.intValue())}, 2));
                        }
                    } else {
                        charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                    }
                } else {
                    if (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) {
                        charSequenceValueOf = null;
                        break;
                    }
                    charSequenceValueOf = selectedItem.toString();
                }
            } else {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            }
            return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? BuildConfig.VERSION_NAME : string;
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
            return null;
        }
    }

    public static final void m(View view, JSONObject jSONObject) {
        if (qf.a.b(h.class)) {
            return;
        }
        try {
            m.f(view, "view");
            try {
                String strI = i(view);
                String strG = g(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", b(view));
                jSONObject.put("id", view.getId());
                if (g.b(view)) {
                    jSONObject.put("text", BuildConfig.VERSION_NAME);
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put("text", j1.e(j1.K(strI)));
                }
                jSONObject.put("hint", j1.e(j1.K(strG)));
                if (tag != null) {
                    jSONObject.put("tag", j1.e(j1.K(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", j1.e(j1.K(contentDescription.toString())));
                }
                jSONObject.put("dimension", f55112a.d(view));
            } catch (JSONException unused) {
                s sVar = s.f49201a;
            }
        } catch (Throwable th2) {
            qf.a.a(h.class, th2);
        }
    }

    public final JSONObject d(View view) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException unused) {
                return jSONObject;
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public final View j(View view, float[] fArr) {
        if (!qf.a.b(this)) {
            try {
                k();
                Method method = f55114c;
                if (method != null && view != null) {
                    try {
                        Object objInvoke = method.invoke(null, fArr, view);
                        m.d(objInvoke, "null cannot be cast to non-null type android.view.View");
                        View view2 = (View) objInvoke;
                        if (view2.getId() > 0) {
                            Object parent = view2.getParent();
                            m.d(parent, "null cannot be cast to non-null type android.view.View");
                            return (View) parent;
                        }
                    } catch (IllegalAccessException unused) {
                        s sVar = s.f49201a;
                    } catch (InvocationTargetException unused2) {
                        s sVar2 = s.f49201a;
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final void k() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            if (f55114c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f55114c = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException unused) {
                s sVar = s.f49201a;
            } catch (NoSuchMethodException unused2) {
                s sVar2 = s.f49201a;
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final boolean l(View view, View view2) {
        if (qf.a.b(this)) {
            return false;
        }
        try {
            m.f(view, "view");
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!qf.a.b(this)) {
                try {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    fArr = new float[]{iArr[0], iArr[1]};
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                }
            }
            View viewJ = j(view2, fArr);
            return viewJ != null && viewJ.getId() == view.getId();
        } catch (Throwable th3) {
            qf.a.a(this, th3);
            return false;
        }
    }
}
