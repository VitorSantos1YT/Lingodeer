package dv;

import android.util.Base64;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f24473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f24475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MediaType f24476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, String str, File file, MediaType mediaType, vy.d dVar) {
        super(1, dVar);
        this.f24473b = lVar;
        this.f24474c = str;
        this.f24475d = file;
        this.f24476e = mediaType;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new k(this.f24473b, this.f24474c, this.f24475d, this.f24476e, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((k) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f24472a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        com.bumptech.glide.e.F(obj);
        h hVar = this.f24473b.f24482c;
        String str = this.f24474c;
        kotlin.jvm.internal.m.c(str);
        RequestBody.Companion companion = RequestBody.Companion;
        try {
            byte[] bArrEncode = Base64.encode(cz.k.S(this.f24475d), 2);
            kotlin.jvm.internal.m.c(bArrEncode);
            Charset UTF_8 = StandardCharsets.UTF_8;
            kotlin.jvm.internal.m.e(UTF_8, "UTF_8");
            String str2 = new String(bArrEncode, UTF_8);
            companion.getClass();
            RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3A = RequestBody.Companion.a(str2, this.f24476e);
            this.f24472a = 1;
            Object objB = hVar.b(str, requestBody$Companion$toRequestBody$3A, this);
            return objB == aVar ? aVar : objB;
        } catch (NullPointerException e8) {
            throw new RuntimeException(e8);
        }
    }
}
