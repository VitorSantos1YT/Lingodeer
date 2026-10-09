package okhttp3.internal.http;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.net.ProtocolException;
import kotlin.jvm.internal.m;
import okhttp3.Protocol;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class StatusLine {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f45359d = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Protocol f45360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45362c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        public static StatusLine a(String statusLine) throws ProtocolException {
            Protocol protocol;
            int i11;
            String strSubstring;
            m.f(statusLine, "statusLine");
            if (x.s0(statusLine, "HTTP/1.", false)) {
                i11 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else if (x.s0(statusLine, "ICY ", false)) {
                protocol = Protocol.HTTP_1_0;
                i11 = 4;
            } else {
                if (!x.s0(statusLine, "SOURCETABLE ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                protocol = Protocol.HTTP_1_1;
                i11 = 12;
            }
            int i12 = i11 + 3;
            if (statusLine.length() < i12) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            String strSubstring2 = statusLine.substring(i11, i12);
            m.e(strSubstring2, "substring(...)");
            Integer numT0 = x.t0(strSubstring2);
            if (numT0 == null) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iIntValue = numT0.intValue();
            if (statusLine.length() <= i12) {
                strSubstring = BuildConfig.VERSION_NAME;
            } else {
                if (statusLine.charAt(i12) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                strSubstring = statusLine.substring(i11 + 4);
                m.e(strSubstring, "substring(...)");
            }
            return new StatusLine(protocol, iIntValue, strSubstring);
        }

        private Companion() {
        }
    }

    public StatusLine(Protocol protocol, int i11, String message) {
        m.f(protocol, "protocol");
        m.f(message, "message");
        this.f45360a = protocol;
        this.f45361b = i11;
        this.f45362c = message;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f45360a == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f45361b);
        sb2.append(' ');
        sb2.append(this.f45362c);
        return sb2.toString();
    }
}
