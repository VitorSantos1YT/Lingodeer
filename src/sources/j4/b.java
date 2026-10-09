package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35838a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f35840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f35842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35845h;

    public b(b bVar, Object obj) {
        this.f35839b = bVar.f35839b;
        this.f35840c = bVar.f35840c;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        a aVar;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), t.f36033h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        a aVar2 = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z11 = true;
            } else if (index == 1) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                aVar2 = a.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    aVar = a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    aVar = a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, CropImageView.DEFAULT_ASPECT_RATIO), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (index == 5) {
                    aVar = a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    aVar = a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    aVar = a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    aVar = a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                aVar2 = aVar;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            b bVar = new b();
            bVar.f35839b = string;
            bVar.f35840c = aVar2;
            bVar.f35838a = z11;
            bVar.f(objValueOf2);
            map.put(string, bVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String strE : map.keySet()) {
            b bVar = (b) map.get(strE);
            if (!bVar.f35838a) {
                strE = ep.a.e("set", strE);
            }
            try {
                int iOrdinal = bVar.f35840c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(strE, cls3).invoke(view, Integer.valueOf(bVar.f35841d));
                        break;
                    case 1:
                        cls.getMethod(strE, cls2).invoke(view, Float.valueOf(bVar.f35842e));
                        break;
                    case 2:
                        cls.getMethod(strE, cls3).invoke(view, Integer.valueOf(bVar.f35845h));
                        break;
                    case 3:
                        Method method = cls.getMethod(strE, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f35845h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strE, CharSequence.class).invoke(view, bVar.f35843f);
                        break;
                    case 5:
                        cls.getMethod(strE, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f35844g));
                        break;
                    case 6:
                        cls.getMethod(strE, cls2).invoke(view, Float.valueOf(bVar.f35842e));
                        break;
                    case 7:
                        cls.getMethod(strE, cls3).invoke(view, Integer.valueOf(bVar.f35841d));
                        break;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }

    public final float a() {
        switch (this.f35840c.ordinal()) {
            case 0:
                return this.f35841d;
            case 1:
            case 6:
                return this.f35842e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                if (this.f35844g) {
                    return 1.0f;
                }
                return CropImageView.DEFAULT_ASPECT_RATIO;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        switch (this.f35840c.ordinal()) {
            case 0:
                fArr[0] = this.f35841d;
                return;
            case 1:
                fArr[0] = this.f35842e;
                return;
            case 2:
            case 3:
                int i11 = this.f35845h;
                int i12 = (i11 >> 24) & 255;
                float fPow = (float) Math.pow(((i11 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i11 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i11 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i12 / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f35844g ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO;
                return;
            case 6:
                fArr[0] = this.f35842e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int iOrdinal = this.f35840c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public final void f(Object obj) {
        switch (this.f35840c.ordinal()) {
            case 0:
            case 7:
                this.f35841d = ((Integer) obj).intValue();
                break;
            case 1:
                this.f35842e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f35845h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f35843f = (String) obj;
                break;
            case 5:
                this.f35844g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f35842e = ((Float) obj).floatValue();
                break;
        }
    }
}
