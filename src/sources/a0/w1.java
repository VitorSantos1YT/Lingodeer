package a0;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.lingo.lingoskill.ui.base.SplashActivity;
import java.util.List;
import rt.j2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(int i11, long j11, ViewModel viewModel, vy.d dVar) {
        super(2, dVar);
        this.f216a = i11;
        this.f218c = j11;
        this.f220e = viewModel;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f216a) {
            case 0:
                return new w1((v1) this.f219d, this.f218c, (y1) this.f220e, dVar, 0);
            case 1:
                return new w1((bh.t) this.f220e, this.f218c, dVar, 1);
            case 2:
                return new w1((bh.a1) this.f220e, this.f218c, dVar, 2);
            case 3:
                return new w1(3, (SplashActivity) this.f219d, (Bundle) this.f220e, dVar);
            case 4:
                return new w1((kr.d0) this.f219d, (fz.e) this.f220e, this.f217b, this.f218c, dVar);
            case 5:
                return new w1(5, (kr.z0) this.f219d, (List) this.f220e, dVar);
            case 6:
                w1 w1Var = new w1((lf.x0) this.f220e, this.f218c, dVar, 6);
                w1Var.f219d = obj;
                return w1Var;
            case 7:
                w1 w1Var2 = new w1((ob.e) this.f220e, this.f218c, dVar, 7);
                w1Var2.f219d = obj;
                return w1Var2;
            case 8:
                return new w1(8, this.f218c, (ph.k) this.f220e, dVar);
            case 9:
                return new w1(9, this.f218c, (ph.a0) this.f220e, dVar);
            case 10:
                return new w1((j2) this.f219d, this.f218c, (rt.n1) this.f220e, dVar, 10);
            case 11:
                w1 w1Var3 = new w1((vp.d) this.f220e, this.f218c, dVar, 11);
                w1Var3.f219d = obj;
                return w1Var3;
            default:
                return new w1((zr.i) this.f219d, (zr.g) this.f220e, this.f218c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f216a) {
            case 0:
                return ((w1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((w1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((w1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((w1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                w1 w1Var = (w1) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                w1Var.invokeSuspend(b0Var);
                return b0Var;
            case 5:
                return ((w1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((w1) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((w1) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((w1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((w1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((w1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((w1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((w1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:235:0x0447  */
    /* JADX WARN: Code duplicated, block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:245:0x04a0 -> B:233:0x043f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f216a = i11;
        this.f219d = obj;
        this.f220e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(Object obj, long j11, Object obj2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f216a = i11;
        this.f219d = obj;
        this.f218c = j11;
        this.f220e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(Object obj, long j11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f216a = i11;
        this.f220e = obj;
        this.f218c = j11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(kr.d0 d0Var, fz.e eVar, int i11, long j11, vy.d dVar) {
        super(2, dVar);
        this.f216a = 4;
        this.f219d = d0Var;
        this.f220e = eVar;
        this.f217b = i11;
        this.f218c = j11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(zr.i iVar, zr.g gVar, long j11, vy.d dVar) {
        super(2, dVar);
        this.f216a = 12;
        this.f219d = iVar;
        this.f220e = gVar;
        this.f218c = j11;
    }
}
