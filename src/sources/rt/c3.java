package rt;

import android.net.Uri;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot.j1 f49558b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(ot.j1 j1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f49557a = i11;
        this.f49558b = j1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f49557a) {
            case 0:
                return new c3(this.f49558b, dVar, 0);
            case 1:
                return new c3(this.f49558b, dVar, 1);
            default:
                return new c3(this.f49558b, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f49557a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((c3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x016e  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        int i11 = this.f49557a;
        String str = BuildConfig.VERSION_NAME;
        Uri videoUri = null;
        ot.j1 j1Var = this.f49558b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (j1Var instanceof ot.o0) {
                    videoUri = ((ot.o0) j1Var).f45930b.f45802a.getVideoUri();
                } else if (j1Var instanceof ot.s0) {
                    videoUri = ((ot.s0) j1Var).f45985b.f45907a.getVideoUri();
                } else if (j1Var instanceof ot.u0) {
                    videoUri = ((ot.u0) j1Var).f46011b.f45948a.getVideoUri();
                } else if (j1Var instanceof ot.c1) {
                    videoUri = ((ot.c1) j1Var).f45766b.f46012a.getVideoUri();
                } else if (j1Var instanceof ot.e1) {
                    videoUri = ((ot.e1) j1Var).f45799b.f46042a.getVideoUri();
                }
                if (videoUri != null && j1Var.a().f33762j) {
                    String path = videoUri.getPath();
                    if (path != null) {
                        str = path;
                    }
                    z11 = new File(str).exists();
                }
                return Boolean.valueOf(z11);
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (j1Var instanceof ot.o0) {
                    videoUri = ((ot.o0) j1Var).f45930b.f45802a.getVideoUri();
                } else if (j1Var instanceof ot.s0) {
                    videoUri = ((ot.s0) j1Var).f45985b.f45907a.getVideoUri();
                } else if (j1Var instanceof ot.u0) {
                    videoUri = ((ot.u0) j1Var).f46011b.f45948a.getVideoUri();
                } else if (j1Var instanceof ot.c1) {
                    videoUri = ((ot.c1) j1Var).f45766b.f46012a.getVideoUri();
                } else if (j1Var instanceof ot.e1) {
                    videoUri = ((ot.e1) j1Var).f45799b.f46042a.getVideoUri();
                }
                if (videoUri != null && j1Var.a().f33762j) {
                    String path2 = videoUri.getPath();
                    if (path2 != null) {
                        str = path2;
                    }
                    z11 = new File(str).exists();
                }
                return Boolean.valueOf(z11);
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (j1Var instanceof ot.o0) {
                    videoUri = ((ot.o0) j1Var).f45930b.f45802a.getVideoUri();
                } else if (j1Var instanceof ot.s0) {
                    videoUri = ((ot.s0) j1Var).f45985b.f45907a.getVideoUri();
                } else if (j1Var instanceof ot.u0) {
                    videoUri = ((ot.u0) j1Var).f46011b.f45948a.getVideoUri();
                } else if (j1Var instanceof ot.c1) {
                    videoUri = ((ot.c1) j1Var).f45766b.f46012a.getVideoUri();
                } else if (j1Var instanceof ot.e1) {
                    videoUri = ((ot.e1) j1Var).f45799b.f46042a.getVideoUri();
                }
                if (videoUri != null && j1Var.a().f33762j) {
                    String path3 = videoUri.getPath();
                    if (path3 != null) {
                        str = path3;
                    }
                    z11 = new File(str).exists();
                }
                return Boolean.valueOf(z11);
        }
    }
}
