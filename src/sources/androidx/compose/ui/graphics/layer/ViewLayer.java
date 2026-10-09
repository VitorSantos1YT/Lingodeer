package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import fz.c;
import g2.v;
import g2.w;
import h1.l5;
import i2.b;
import j2.a;
import j2.e;
import v3.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer extends View {
    public static final l5 M = new l5(1);
    public m H;
    public c K;
    public j2.c L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DrawChildContainer f1135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f1136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Outline f1139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1140f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public v3.c f1141t;

    public ViewLayer(DrawChildContainer drawChildContainer, w wVar, b bVar) {
        super(drawChildContainer.getContext());
        this.f1135a = drawChildContainer;
        this.f1136b = wVar;
        this.f1137c = bVar;
        setOutlineProvider(M);
        this.f1140f = true;
        this.f1141t = i2.c.f34124a;
        this.H = m.Ltr;
        e.f35571a.getClass();
        this.K = a.f35538c;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        w wVar = this.f1136b;
        g2.c cVar = wVar.f28614a;
        Canvas canvas2 = cVar.f28539a;
        cVar.f28539a = canvas;
        v3.c cVar2 = this.f1141t;
        m mVar = this.H;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        j2.c cVar3 = this.L;
        c cVar4 = this.K;
        b bVar = this.f1137c;
        v3.c cVarA = bVar.j0().A();
        m mVarE = bVar.j0().E();
        v vVarX = bVar.j0().x();
        long jH = bVar.j0().H();
        j2.c cVar5 = (j2.c) bVar.j0().f56175c;
        xq.c cVarJ0 = bVar.j0();
        cVarJ0.R(cVar2);
        cVarJ0.S(mVar);
        cVarJ0.Q(cVar);
        cVarJ0.T(jFloatToRawIntBits);
        cVarJ0.f56175c = cVar3;
        cVar.e();
        try {
            cVar4.invoke(bVar);
            cVar.p();
            xq.c cVarJ1 = bVar.j0();
            cVarJ1.R(cVarA);
            cVarJ1.S(mVarE);
            cVarJ1.Q(vVarX);
            cVarJ1.T(jH);
            cVarJ1.f56175c = cVar5;
            wVar.f28614a.f28539a = canvas2;
            this.f1138d = false;
        } catch (Throwable th2) {
            cVar.p();
            xq.c cVarJ2 = bVar.j0();
            cVarJ2.R(cVarA);
            cVarJ2.S(mVarE);
            cVarJ2.Q(vVarX);
            cVarJ2.T(jH);
            cVarJ2.f56175c = cVar5;
            throw th2;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f1140f;
    }

    public final w getCanvasHolder() {
        return this.f1136b;
    }

    public final View getOwnerView() {
        return this.f1135a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f1140f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f1138d) {
            return;
        }
        this.f1138d = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z11) {
        if (this.f1140f != z11) {
            this.f1140f = z11;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z11) {
        this.f1138d = z11;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
