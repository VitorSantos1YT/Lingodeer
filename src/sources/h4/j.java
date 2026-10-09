package h4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31694e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31695f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31696g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31697h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f31698i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f31699j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f31700k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f31701l = Float.NaN;
    public int m = 0;

    @Override // h4.c
    public final void a(HashMap map) {
        throw null;
    }

    @Override // h4.c
    /* JADX INFO: renamed from: b */
    public final c clone() {
        j jVar = new j();
        super.c(this);
        jVar.f31695f = this.f31695f;
        jVar.f31696g = this.f31696g;
        jVar.f31697h = this.f31697h;
        jVar.f31698i = this.f31698i;
        jVar.f31699j = Float.NaN;
        jVar.f31700k = this.f31700k;
        jVar.f31701l = this.f31701l;
        return jVar;
    }

    @Override // h4.c
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j4.t.m);
        SparseIntArray sparseIntArray = i.f31693a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            SparseIntArray sparseIntArray2 = i.f31693a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.f1268h1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f31562b);
                        this.f31562b = resourceId;
                        if (resourceId == -1) {
                            this.f31563c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f31563c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f31562b = typedArrayObtainStyledAttributes.getResourceId(index, this.f31562b);
                    }
                    break;
                case 2:
                    this.f31561a = typedArrayObtainStyledAttributes.getInt(index, this.f31561a);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f31695f = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f31695f = c4.e.f6546d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f31694e = typedArrayObtainStyledAttributes.getInteger(index, this.f31694e);
                    break;
                case 5:
                    this.f31697h = typedArrayObtainStyledAttributes.getInt(index, this.f31697h);
                    break;
                case 6:
                    this.f31700k = typedArrayObtainStyledAttributes.getFloat(index, this.f31700k);
                    break;
                case 7:
                    this.f31701l = typedArrayObtainStyledAttributes.getFloat(index, this.f31701l);
                    break;
                case 8:
                    float f5 = typedArrayObtainStyledAttributes.getFloat(index, this.f31699j);
                    this.f31698i = f5;
                    this.f31699j = f5;
                    break;
                case 9:
                    this.m = typedArrayObtainStyledAttributes.getInt(index, this.m);
                    break;
                case 10:
                    this.f31696g = typedArrayObtainStyledAttributes.getInt(index, this.f31696g);
                    break;
                case 11:
                    this.f31698i = typedArrayObtainStyledAttributes.getFloat(index, this.f31698i);
                    break;
                case 12:
                    this.f31699j = typedArrayObtainStyledAttributes.getFloat(index, this.f31699j);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }

    public final void h(Object obj, String str) {
        switch (str) {
            case "transitionEasing":
                this.f31695f = obj.toString();
                break;
            case "percentWidth":
                this.f31698i = c.g((Number) obj);
                break;
            case "percentHeight":
                this.f31699j = c.g((Number) obj);
                break;
            case "drawPath":
                Number number = (Number) obj;
                this.f31697h = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "sizePercent":
                float fG = c.g((Number) obj);
                this.f31698i = fG;
                this.f31699j = fG;
                break;
            case "percentX":
                this.f31700k = c.g((Number) obj);
                break;
            case "percentY":
                this.f31701l = c.g((Number) obj);
                break;
        }
    }

    @Override // h4.c
    public final void d(HashSet hashSet) {
    }
}
