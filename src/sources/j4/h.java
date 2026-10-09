package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f35903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f35904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f35905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f35907f;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f35902a = Float.NaN;
        this.f35903b = Float.NaN;
        this.f35904c = Float.NaN;
        this.f35905d = Float.NaN;
        this.f35906e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), t.F);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f35906e);
                this.f35906e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    p pVar = new p();
                    this.f35907f = pVar;
                    pVar.e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f35905d = typedArrayObtainStyledAttributes.getDimension(index, this.f35905d);
            } else if (index == 2) {
                this.f35903b = typedArrayObtainStyledAttributes.getDimension(index, this.f35903b);
            } else if (index == 3) {
                this.f35904c = typedArrayObtainStyledAttributes.getDimension(index, this.f35904c);
            } else if (index == 4) {
                this.f35902a = typedArrayObtainStyledAttributes.getDimension(index, this.f35902a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(float f5, float f11) {
        float f12 = this.f35902a;
        if (!Float.isNaN(f12) && f5 < f12) {
            return false;
        }
        float f13 = this.f35903b;
        if (!Float.isNaN(f13) && f11 < f13) {
            return false;
        }
        float f14 = this.f35904c;
        if (!Float.isNaN(f14) && f5 > f14) {
            return false;
        }
        float f15 = this.f35905d;
        return Float.isNaN(f15) || f11 <= f15;
    }
}
