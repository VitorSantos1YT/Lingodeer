package o20;

import okhttp3.MultipartBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f44531c = new k0();

    @Override // o20.c1
    public final void a(q0 q0Var, Object obj) {
        MultipartBody.Part part = (MultipartBody.Part) obj;
        if (part != null) {
            MultipartBody.Builder builder = q0Var.f44552i;
            builder.getClass();
            builder.f45080c.add(part);
        }
    }
}
