package qw;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Parser;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import lw.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends InputStream implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FetchEligibleCampaignsRequest f48454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parser f48455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteArrayInputStream f48456c;

    public a(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest, Parser parser) {
        this.f48454a = fetchEligibleCampaignsRequest;
        this.f48455b = parser;
    }

    @Override // java.io.InputStream
    public final int available() {
        FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest = this.f48454a;
        if (fetchEligibleCampaignsRequest != null) {
            return fetchEligibleCampaignsRequest.k(null);
        }
        ByteArrayInputStream byteArrayInputStream = this.f48456c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f48454a != null) {
            this.f48456c = new ByteArrayInputStream(this.f48454a.n());
            this.f48454a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f48456c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) {
        FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest = this.f48454a;
        if (fetchEligibleCampaignsRequest != null) {
            int iK = fetchEligibleCampaignsRequest.k(null);
            if (iK == 0) {
                this.f48454a = null;
                this.f48456c = null;
                return -1;
            }
            if (i12 >= iK) {
                CodedOutputStream codedOutputStreamB0 = CodedOutputStream.b0(bArr, i11, iK);
                this.f48454a.d(codedOutputStreamB0);
                if (codedOutputStreamB0.c0() == 0) {
                    this.f48454a = null;
                    this.f48456c = null;
                    return iK;
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            this.f48456c = new ByteArrayInputStream(this.f48454a.n());
            this.f48454a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f48456c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i11, i12);
        }
        return -1;
    }
}
