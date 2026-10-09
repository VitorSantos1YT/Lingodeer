package q6;

import a0.p1;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import ns.o;
import y.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ry.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1 f47490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f47491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f47492c;

    public i(p1 p1Var, sy.c cVar, ArrayList arrayList, u uVar) {
        if (uVar.f56769b != arrayList.size() + 1) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
        }
        int i11 = uVar.f56769b;
        if (i11 == 0) {
            z.a.e("FloatList is empty.");
            throw null;
        }
        float[] fArr = uVar.f56768a;
        int i12 = 0;
        float f5 = fArr[0];
        float fB = CropImageView.DEFAULT_ASPECT_RATIO;
        if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero");
        }
        if (i11 == 0) {
            z.a.e("FloatList is empty.");
            throw null;
        }
        if (fArr[i11 - 1] != 1.0f) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one");
        }
        this.f47490a = p1Var;
        this.f47492c = cVar;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i12 < size) {
            int i13 = i12 + 1;
            if (uVar.b(i13) - uVar.b(i12) > 1.0E-4f) {
                arrayList2.add(new h(this, (c) arrayList.get(i12), fB, uVar.b(i13)));
                fB = uVar.b(i13);
            }
            i12 = i13;
        }
        h hVar = (h) arrayList2.get(o.A(arrayList2));
        float f11 = hVar.f47487c;
        if (1.0f < f11) {
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        hVar.f47487c = f11;
        hVar.f47488d = 1.0f;
        this.f47491b = arrayList2;
    }

    @Override // ry.a
    public final int b() {
        return this.f47491b.size();
    }

    @Override // ry.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return super.contains((h) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        return (h) this.f47491b.get(i11);
    }

    @Override // ry.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return super.indexOf((h) obj);
        }
        return -1;
    }

    @Override // ry.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return super.lastIndexOf((h) obj);
        }
        return -1;
    }
}
