package retrofit2;

import java.util.Objects;
import o20.t0;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class HttpException extends RuntimeException {
    public HttpException(t0 t0Var) {
        Objects.requireNonNull(t0Var, "response == null");
        StringBuilder sb2 = new StringBuilder("HTTP ");
        Response response = t0Var.f44598a;
        sb2.append(response.f45161d);
        sb2.append(" ");
        sb2.append(response.f45160c);
        super(sb2.toString());
        int i11 = response.f45161d;
        String str = response.f45160c;
    }
}
