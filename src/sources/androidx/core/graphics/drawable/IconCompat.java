package androidx.core.graphics.drawable;

import a2.l;
import a5.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import z6.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1399k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f1402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f1403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1409j;

    public IconCompat() {
        this.f1400a = -1;
        this.f1402c = null;
        this.f1403d = null;
        this.f1404e = 0;
        this.f1405f = 0;
        this.f1406g = null;
        this.f1407h = f1399k;
        this.f1408i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z11) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f5 = iMin;
        float f11 = 0.5f * f5;
        float f12 = 0.9166667f * f11;
        if (z11) {
            float f13 = 0.010416667f * f5;
            paint.setColor(0);
            paint.setShadowLayer(f13, CropImageView.DEFAULT_ASPECT_RATIO, f5 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1404e = i11;
        iconCompat.f1401b = BuildConfig.VERSION_NAME;
        iconCompat.f1409j = BuildConfig.VERSION_NAME;
        return iconCompat;
    }

    public final int c() {
        int i11 = this.f1400a;
        if (i11 != -1) {
            if (i11 == 2) {
                return this.f1404e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i12 = Build.VERSION.SDK_INT;
        Object obj = this.f1401b;
        if (i12 >= 28) {
            return l.m(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public final int d() {
        int i11 = this.f1400a;
        if (i11 != -1) {
            return i11;
        }
        int i12 = Build.VERSION.SDK_INT;
        Object obj = this.f1401b;
        if (i12 >= 28) {
            return l.u(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            Objects.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            Objects.toString(obj);
            return -1;
        }
    }

    public final Uri e() {
        int i11 = this.f1400a;
        if (i11 == -1) {
            int i12 = Build.VERSION.SDK_INT;
            Object obj = this.f1401b;
            if (i12 >= 28) {
                return l.v(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i11 == 4 || i11 == 6) {
            return Uri.parse((String) this.f1401b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final Icon f(Context context) {
        Icon iconCreateWithBitmap;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = this.f1400a;
        String strN = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream = null;
        switch (i12) {
            case -1:
                return (Icon) this.f1401b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f1401b);
                break;
            case 2:
                if (i12 == -1) {
                    Object obj = this.f1401b;
                    if (i11 >= 28) {
                        strN = l.n(obj);
                    } else {
                        try {
                            strN = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.f1409j;
                    strN = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1401b).split(":", -1)[0] : this.f1409j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strN, this.f1404e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f1401b, this.f1404e, this.f1405f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f1401b);
                break;
            case 5:
                iconCreateWithBitmap = i11 < 26 ? Icon.createWithBitmap(a((Bitmap) this.f1401b, false)) : c.b((Bitmap) this.f1401b);
                break;
            case 6:
                if (i11 >= 30) {
                    iconCreateWithBitmap = d.a(e());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + e());
                    }
                    Uri uriE = e();
                    String scheme = uriE.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriE);
                        } catch (Exception unused2) {
                            uriE.toString();
                        }
                        break;
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f1401b));
                        } catch (FileNotFoundException unused3) {
                            uriE.toString();
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                    } else {
                        iconCreateWithBitmap = c.b(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.f1406g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f1407h;
        if (mode != f1399k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f1400a == -1) {
            return String.valueOf(this.f1401b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1400a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1400a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1401b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1401b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1409j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1404e);
                if (this.f1405f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1405f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1401b);
                break;
        }
        if (this.f1406g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1406g);
        }
        if (this.f1407h != f1399k) {
            sb2.append(" mode=");
            sb2.append(this.f1407h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i11) {
        this.f1402c = null;
        this.f1403d = null;
        this.f1404e = 0;
        this.f1405f = 0;
        this.f1406g = null;
        this.f1407h = f1399k;
        this.f1408i = null;
        this.f1400a = i11;
    }
}
