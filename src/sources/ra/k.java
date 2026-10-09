package ra;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f49011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f49012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f49013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f49014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f49015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f49016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f49017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f49018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f49019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f49020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f49021k;

    public k() {
        this.f49011a = new Matrix();
        this.f49012b = new ArrayList();
        this.f49013c = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49014d = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49015e = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49016f = 1.0f;
        this.f49017g = 1.0f;
        this.f49018h = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49019i = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49020j = new Matrix();
        this.f49021k = null;
    }

    @Override // ra.l
    public final boolean a() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f49012b;
            if (i11 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i11)).a()) {
                return true;
            }
            i11++;
        }
    }

    @Override // ra.l
    public final boolean b(int[] iArr) {
        int i11 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f49012b;
            if (i11 >= arrayList.size()) {
                return zB;
            }
            zB |= ((l) arrayList.get(i11)).b(iArr);
            i11++;
        }
    }

    public final void c() {
        Matrix matrix = this.f49020j;
        matrix.reset();
        matrix.postTranslate(-this.f49014d, -this.f49015e);
        matrix.postScale(this.f49016f, this.f49017g);
        matrix.postRotate(this.f49013c, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
        matrix.postTranslate(this.f49018h + this.f49014d, this.f49019i + this.f49015e);
    }

    public String getGroupName() {
        return this.f49021k;
    }

    public Matrix getLocalMatrix() {
        return this.f49020j;
    }

    public float getPivotX() {
        return this.f49014d;
    }

    public float getPivotY() {
        return this.f49015e;
    }

    public float getRotation() {
        return this.f49013c;
    }

    public float getScaleX() {
        return this.f49016f;
    }

    public float getScaleY() {
        return this.f49017g;
    }

    public float getTranslateX() {
        return this.f49018h;
    }

    public float getTranslateY() {
        return this.f49019i;
    }

    public void setPivotX(float f5) {
        if (f5 != this.f49014d) {
            this.f49014d = f5;
            c();
        }
    }

    public void setPivotY(float f5) {
        if (f5 != this.f49015e) {
            this.f49015e = f5;
            c();
        }
    }

    public void setRotation(float f5) {
        if (f5 != this.f49013c) {
            this.f49013c = f5;
            c();
        }
    }

    public void setScaleX(float f5) {
        if (f5 != this.f49016f) {
            this.f49016f = f5;
            c();
        }
    }

    public void setScaleY(float f5) {
        if (f5 != this.f49017g) {
            this.f49017g = f5;
            c();
        }
    }

    public void setTranslateX(float f5) {
        if (f5 != this.f49018h) {
            this.f49018h = f5;
            c();
        }
    }

    public void setTranslateY(float f5) {
        if (f5 != this.f49019i) {
            this.f49019i = f5;
            c();
        }
    }

    public k(k kVar, y.e eVar) {
        m iVar;
        this.f49011a = new Matrix();
        this.f49012b = new ArrayList();
        this.f49013c = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49014d = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49015e = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49016f = 1.0f;
        this.f49017g = 1.0f;
        this.f49018h = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f49019i = CropImageView.DEFAULT_ASPECT_RATIO;
        Matrix matrix = new Matrix();
        this.f49020j = matrix;
        this.f49021k = null;
        this.f49013c = kVar.f49013c;
        this.f49014d = kVar.f49014d;
        this.f49015e = kVar.f49015e;
        this.f49016f = kVar.f49016f;
        this.f49017g = kVar.f49017g;
        this.f49018h = kVar.f49018h;
        this.f49019i = kVar.f49019i;
        String str = kVar.f49021k;
        this.f49021k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(kVar.f49020j);
        ArrayList arrayList = kVar.f49012b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Object obj = arrayList.get(i11);
            if (obj instanceof k) {
                this.f49012b.add(new k((k) obj, eVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    j jVar2 = new j(jVar);
                    jVar2.f49002e = CropImageView.DEFAULT_ASPECT_RATIO;
                    jVar2.f49004g = 1.0f;
                    jVar2.f49005h = 1.0f;
                    jVar2.f49006i = CropImageView.DEFAULT_ASPECT_RATIO;
                    jVar2.f49007j = 1.0f;
                    jVar2.f49008k = CropImageView.DEFAULT_ASPECT_RATIO;
                    jVar2.f49009l = Paint.Cap.BUTT;
                    jVar2.m = Paint.Join.MITER;
                    jVar2.f49010n = 4.0f;
                    jVar2.f49001d = jVar.f49001d;
                    jVar2.f49002e = jVar.f49002e;
                    jVar2.f49004g = jVar.f49004g;
                    jVar2.f49003f = jVar.f49003f;
                    jVar2.f49024c = jVar.f49024c;
                    jVar2.f49005h = jVar.f49005h;
                    jVar2.f49006i = jVar.f49006i;
                    jVar2.f49007j = jVar.f49007j;
                    jVar2.f49008k = jVar.f49008k;
                    jVar2.f49009l = jVar.f49009l;
                    jVar2.m = jVar.m;
                    jVar2.f49010n = jVar.f49010n;
                    iVar = jVar2;
                } else if (obj instanceof i) {
                    iVar = new i((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49012b.add(iVar);
                Object obj2 = iVar.f49023b;
                if (obj2 != null) {
                    eVar.put(obj2, iVar);
                }
            }
        }
    }
}
