package cu;

import java.io.File;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends xy.i implements fz.e {
    public int H;
    public final /* synthetic */ g K;
    public final /* synthetic */ File L;
    public final /* synthetic */ File M;
    public final /* synthetic */ String N;
    public final /* synthetic */ boolean O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a00.a f22501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f22502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f22503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public File f22504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f22505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22506f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22507t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, File file, File file2, String str, boolean z11, vy.d dVar) {
        super(2, dVar);
        this.K = gVar;
        this.L = file;
        this.M = file2;
        this.N = str;
        this.O = z11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new e(this.K, this.L, this.M, this.N, this.O, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        g gVar;
        File file;
        String str;
        File file2;
        boolean z11;
        a00.a aVar;
        int i11;
        a00.a aVar2;
        Object objB;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.H;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                a00.e eVar = g.f22515b;
                this.f22501a = eVar;
                gVar = this.K;
                this.f22502b = gVar;
                file = this.L;
                this.f22503c = file;
                File file3 = this.M;
                this.f22504d = file3;
                str = this.N;
                this.f22505e = str;
                boolean z12 = this.O;
                this.f22506f = z12;
                this.f22507t = 0;
                this.H = 1;
                if (eVar.b(this) != aVar3) {
                    file2 = file3;
                    z11 = z12;
                    aVar = eVar;
                    i11 = 0;
                }
                return aVar3;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = this.f22501a;
                try {
                    com.bumptech.glide.e.F(obj);
                    objB = obj;
                    u uVar = (u) objB;
                    aVar2.a(null);
                    return uVar;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.a(null);
                    throw th;
                }
            }
            i11 = this.f22507t;
            boolean z13 = this.f22506f;
            str = this.f22505e;
            File file4 = this.f22504d;
            file = this.f22503c;
            gVar = this.f22502b;
            aVar = this.f22501a;
            com.bumptech.glide.e.F(obj);
            z11 = z13;
            file2 = file4;
            this.f22501a = aVar;
            this.f22502b = null;
            this.f22503c = null;
            this.f22504d = null;
            this.f22505e = null;
            this.f22507t = i11;
            this.H = 2;
            objB = g.b(gVar, file, file2, str, z11, this);
            if (objB != aVar3) {
                aVar2 = aVar;
                u uVar2 = (u) objB;
                aVar2.a(null);
                return uVar2;
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.a(null);
            throw th;
        }
    }
}
