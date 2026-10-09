package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f35991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f35992e;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.A);
        this.f35988a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 1) {
                this.f35991d = typedArrayObtainStyledAttributes.getFloat(index, this.f35991d);
            } else if (index == 0) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f35989b);
                this.f35989b = i12;
                this.f35989b = p.f36007h[i12];
            } else if (index == 4) {
                this.f35990c = typedArrayObtainStyledAttributes.getInt(index, this.f35990c);
            } else if (index == 3) {
                this.f35992e = typedArrayObtainStyledAttributes.getFloat(index, this.f35992e);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
