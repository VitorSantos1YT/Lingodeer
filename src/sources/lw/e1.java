package lw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f40367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qw.b f40370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qw.b f40371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f40372f;

    public e1(d1 d1Var, String str, qw.b bVar, qw.b bVar2) {
        new AtomicReferenceArray(2);
        Preconditions.k(d1Var, "type");
        this.f40367a = d1Var;
        Preconditions.k(str, "fullMethodName");
        this.f40368b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.f40369c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        this.f40370d = bVar;
        this.f40371e = bVar2;
        this.f40372f = true;
    }

    public static String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        Preconditions.k(str, "fullServiceName");
        sb2.append(str);
        sb2.append("/");
        Preconditions.k(str2, "methodName");
        sb2.append(str2);
        return sb2.toString();
    }

    public final MessageLite b(InputStream inputStream) {
        CodedInputStream codedInputStreamF;
        byte[] bArr;
        qw.b bVar = this.f40371e;
        bVar.getClass();
        if ((inputStream instanceof qw.a) && ((qw.a) inputStream).f48455b == bVar.f48458a) {
            try {
                FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest = ((qw.a) inputStream).f48454a;
                if (fetchEligibleCampaignsRequest != null) {
                    return fetchEligibleCampaignsRequest;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException unused) {
            }
        }
        try {
            if (inputStream instanceof j0) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return bVar.f48459b;
                    }
                    codedInputStreamF = null;
                } else {
                    ThreadLocal threadLocal = qw.b.f48457d;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i11 = iAvailable;
                    while (i11 > 0) {
                        int i12 = inputStream.read(bArr, iAvailable - i11, i11);
                        if (i12 == -1) {
                            break;
                        }
                        i11 -= i12;
                    }
                    if (i11 != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i11));
                    }
                    codedInputStreamF = CodedInputStream.g(bArr, 0, iAvailable, false);
                }
            } else {
                codedInputStreamF = null;
            }
            if (codedInputStreamF == null) {
                codedInputStreamF = CodedInputStream.f(inputStream);
            }
            codedInputStreamF.f21172c = Integer.MAX_VALUE;
            int i13 = bVar.f48460c;
            if (i13 >= 0) {
                if (i13 < 0) {
                    throw new IllegalArgumentException(nv.p.j(i13, "Recursion limit cannot be negative: "));
                }
                codedInputStreamF.f21171b = i13;
            }
            try {
                MessageLite messageLiteA = bVar.f48458a.a(codedInputStreamF, qw.c.f48461a);
                try {
                    codedInputStreamF.a(0);
                    return messageLiteA;
                } catch (InvalidProtocolBufferException e8) {
                    e8.f21285a = messageLiteA;
                    throw e8;
                }
            } catch (InvalidProtocolBufferException e10) {
                throw q1.f40441l.h("Invalid protobuf byte sequence").g(e10).a();
            }
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final qw.a c(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
        qw.b bVar = this.f40370d;
        bVar.getClass();
        return new qw.a(fetchEligibleCampaignsRequest, bVar.f48458a);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f40368b, "fullMethodName");
        toStringHelperB.c(this.f40367a, "type");
        toStringHelperB.d("idempotent", false);
        toStringHelperB.d("safe", false);
        toStringHelperB.d("sampledToLocalTracing", this.f40372f);
        toStringHelperB.c(this.f40370d, "requestMarshaller");
        toStringHelperB.c(this.f40371e, "responseMarshaller");
        toStringHelperB.c(null, "schemaDescriptor");
        toStringHelperB.f16371d = true;
        return toStringHelperB.toString();
    }
}
