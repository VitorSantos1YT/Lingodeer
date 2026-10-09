package dg;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.yalantis.ucrop.view.CropImageView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import v3.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f23419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f23421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f23422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f23423e;

    public e() {
        m mVar = m.Ltr;
        this.f23419a = 0L;
        this.f23420b = 0;
        this.f23423e = new i2.b();
    }

    public ObjectAnimator a() {
        HashMap map = (HashMap) this.f23423e;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[map.size()];
        Iterator it = map.entrySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            c cVar = (c) ((Map.Entry) it.next()).getValue();
            float[] fArr = cVar.f23416a;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i12 = this.f23420b;
            float f5 = fArr[i12];
            while (true) {
                int i13 = this.f23420b;
                Object[] objArr = cVar.f23418c;
                if (i12 < objArr.length + i13) {
                    int i14 = i12 - i13;
                    int length = i12 % objArr.length;
                    float f11 = fArr[length] - f5;
                    if (f11 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        f11 += fArr[fArr.length - 1];
                    }
                    if (cVar instanceof d) {
                        keyframeArr[i14] = Keyframe.ofInt(f11, ((Integer) objArr[length]).intValue());
                    } else if (cVar instanceof b) {
                        keyframeArr[i14] = Keyframe.ofFloat(f11, ((Float) objArr[length]).floatValue());
                    } else {
                        keyframeArr[i14] = Keyframe.ofObject(f11, objArr[length]);
                    }
                    i12++;
                }
            }
            propertyValuesHolderArr[i11] = PropertyValuesHolder.ofKeyframe(cVar.f23417b, keyframeArr);
            i11++;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((fg.e) this.f23421c, propertyValuesHolderArr);
        objectAnimatorOfPropertyValuesHolder.setDuration(this.f23419a);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder.setInterpolator((Interpolator) this.f23422d);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public void b(float... fArr) {
        eg.a aVar = new eg.a(new PathInterpolator(0.42f, CropImageView.DEFAULT_ASPECT_RATIO, 0.58f, 1.0f), new float[0]);
        aVar.f25531b = fArr;
        this.f23422d = aVar;
    }

    public void c(float[] fArr, Property property, Float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        if (length != length2) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(length), Integer.valueOf(length2)));
        }
        ((HashMap) this.f23423e).put(property.getName(), new b(fArr, property, fArr2));
    }

    public void d(float[] fArr, Property property, Integer[] numArr) {
        int length = fArr.length;
        int length2 = numArr.length;
        if (length != length2) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(length), Integer.valueOf(length2)));
        }
        ((HashMap) this.f23423e).put(property.getName(), new d(fArr, property, numArr));
    }

    public e(fg.e eVar) {
        this.f23419a = 2000L;
        this.f23420b = 0;
        this.f23423e = new HashMap();
        this.f23421c = eVar;
    }
}
