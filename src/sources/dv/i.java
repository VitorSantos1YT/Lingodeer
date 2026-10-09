package dv;

import java.io.File;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f24456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MediaType f24459e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, String str, String str2, MediaType mediaType, vy.d dVar) {
        super(1, dVar);
        this.f24456b = lVar;
        this.f24457c = str;
        this.f24458d = str2;
        this.f24459e = mediaType;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new i(this.f24456b, this.f24457c, this.f24458d, this.f24459e, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((i) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f24455a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        com.bumptech.glide.e.F(obj);
        l lVar = this.f24456b;
        h hVar = lVar.f24482c;
        vt.n0 n0Var = lVar.f24480a;
        String str = this.f24457c;
        kotlin.jvm.internal.m.c(str);
        RequestBody.Companion.getClass();
        String str2 = this.f24458d;
        RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3A = RequestBody.Companion.a(str2, this.f24459e);
        if (((fr.o0) n0Var).z()) {
            cz.k.V(new File(defpackage.e.m(((fr.o0) n0Var).v(), "character_ocr.txt")), str2);
        }
        this.f24455a = 1;
        Object objA = hVar.a(str, requestBody$Companion$toRequestBody$3A, this);
        return objA == aVar ? aVar : objA;
    }
}
