package app.rive.runtime.kotlin.core;

import com.android.volley.ParseError;
import fz.c;
import kotlin.jvm.internal.m;
import pd.e;
import pd.h;
import pd.j;
import pd.l;
import se.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class BytesRequest extends h {
    public static final int $stable = 0;
    private final c onResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BytesRequest(String url, c onResponse, j errorListener) {
        super(url, errorListener);
        m.f(url, "url");
        m.f(onResponse, "onResponse");
        m.f(errorListener, "errorListener");
        this.onResponse = onResponse;
    }

    @Override // pd.h
    public l parseNetworkResponse(e eVar) {
        byte[] bArr;
        if (eVar != null) {
            try {
                bArr = eVar.f46783a;
            } catch (Exception e8) {
                return new l(new ParseError(e8));
            }
        } else {
            bArr = null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new l(bArr, i.z(eVar));
    }

    @Override // pd.h
    public void deliverResponse(byte[] response) {
        m.f(response, "response");
        this.onResponse.invoke(response);
    }
}
