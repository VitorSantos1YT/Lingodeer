package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f36055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f36056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f36057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f36058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36059e;

    public x(Context context, XmlResourceParser xmlResourceParser) {
        this.f36055a = Float.NaN;
        this.f36056b = Float.NaN;
        this.f36057c = Float.NaN;
        this.f36058d = Float.NaN;
        this.f36059e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), t.F);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f36059e);
                this.f36059e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.f36058d = typedArrayObtainStyledAttributes.getDimension(index, this.f36058d);
            } else if (index == 2) {
                this.f36056b = typedArrayObtainStyledAttributes.getDimension(index, this.f36056b);
            } else if (index == 3) {
                this.f36057c = typedArrayObtainStyledAttributes.getDimension(index, this.f36057c);
            } else if (index == 4) {
                this.f36055a = typedArrayObtainStyledAttributes.getDimension(index, this.f36055a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(float f5, float f11) {
        float f12 = this.f36055a;
        if (!Float.isNaN(f12) && f5 < f12) {
            return false;
        }
        float f13 = this.f36056b;
        if (!Float.isNaN(f13) && f11 < f13) {
            return false;
        }
        float f14 = this.f36057c;
        if (!Float.isNaN(f14) && f5 > f14) {
            return false;
        }
        float f15 = this.f36058d;
        return Float.isNaN(f15) || f11 <= f15;
    }
}
