package ad;

import com.yalantis.ucrop.view.CropImageView;
import d0.o1;
import l1.b3;
import l1.g0;
import l1.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements b3 {
    public final g0 H;
    public final k1 K;
    public final k1 L;
    public final k1 M;
    public final k1 N;
    public final g0 O;
    public final o1 P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f604f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f605t;

    public i() {
        Boolean bool = Boolean.FALSE;
        this.f599a = l1.t.B(bool);
        this.f600b = l1.t.B(1);
        this.f601c = l1.t.B(1);
        this.f602d = l1.t.B(bool);
        this.f603e = l1.t.B(null);
        this.f604f = l1.t.B(Float.valueOf(1.0f));
        this.f605t = l1.t.B(bool);
        this.H = l1.t.s(new g(this, 1));
        this.K = l1.t.B(null);
        Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        this.L = l1.t.B(fValueOf);
        this.M = l1.t.B(fValueOf);
        this.N = l1.t.B(Long.MIN_VALUE);
        this.O = l1.t.s(new g(this, 0));
        l1.t.s(new g(this, 2));
        this.P = new o1();
    }

    public static final boolean b(i iVar, int i11, long j11) {
        k1 k1Var = iVar.K;
        k1 k1Var2 = iVar.f603e;
        k1 k1Var3 = iVar.L;
        g0 g0Var = iVar.H;
        k1 k1Var4 = iVar.N;
        wc.h hVar = (wc.h) k1Var.getValue();
        if (hVar == null) {
            return true;
        }
        long jLongValue = ((Number) k1Var4.getValue()).longValue() == Long.MIN_VALUE ? 0L : j11 - ((Number) k1Var4.getValue()).longValue();
        k1Var4.setValue(Long.valueOf(j11));
        if (k1Var2.getValue() != null) {
            throw new ClassCastException();
        }
        if (k1Var2.getValue() != null) {
            throw new ClassCastException();
        }
        float fFloatValue = ((Number) g0Var.getValue()).floatValue() * ((jLongValue / ((long) 1000000)) / hVar.b());
        float fFloatValue2 = ((Number) g0Var.getValue()).floatValue() < CropImageView.DEFAULT_ASPECT_RATIO ? CropImageView.DEFAULT_ASPECT_RATIO - (((Number) k1Var3.getValue()).floatValue() + fFloatValue) : (((Number) k1Var3.getValue()).floatValue() + fFloatValue) - 1.0f;
        if (fFloatValue2 < CropImageView.DEFAULT_ASPECT_RATIO) {
            iVar.j(hz.b.k(((Number) k1Var3.getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) + fFloatValue);
            return true;
        }
        int i12 = (int) (fFloatValue2 / 1.0f);
        int i13 = i12 + 1;
        if (iVar.g() + i13 > i11) {
            iVar.j(iVar.f());
            iVar.h(i11);
            return false;
        }
        iVar.h(iVar.g() + i13);
        float f5 = fFloatValue2 - (i12 * 1.0f);
        iVar.j(((Number) g0Var.getValue()).floatValue() < CropImageView.DEFAULT_ASPECT_RATIO ? 1.0f - f5 : CropImageView.DEFAULT_ASPECT_RATIO + f5);
        return true;
    }

    public static final void d(i iVar, boolean z11) {
        iVar.f599a.setValue(Boolean.valueOf(z11));
    }

    public final float f() {
        return ((Number) this.O.getValue()).floatValue();
    }

    public final int g() {
        return ((Number) this.f600b.getValue()).intValue();
    }

    @Override // l1.b3
    public final Object getValue() {
        return Float.valueOf(((Number) this.M.getValue()).floatValue());
    }

    public final void h(int i11) {
        this.f600b.setValue(Integer.valueOf(i11));
    }

    public final void j(float f5) {
        wc.h hVar;
        this.L.setValue(Float.valueOf(f5));
        if (((Boolean) this.f605t.getValue()).booleanValue() && (hVar = (wc.h) this.K.getValue()) != null) {
            f5 -= f5 % (1 / hVar.f54969n);
        }
        this.M.setValue(Float.valueOf(f5));
    }
}
