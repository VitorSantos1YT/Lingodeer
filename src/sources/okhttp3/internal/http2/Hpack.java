package okhttp3.internal.http2;

import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import m00.d0;
import m00.i;
import m00.l;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Hpack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hpack f45398a = new Hpack();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Header[] f45399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f45400c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Reader {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d0 f45403c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f45406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f45407g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45401a = 4096;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f45402b = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Header[] f45404d = new Header[8];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45405e = 7;

        public Reader(Http2Reader.ContinuationSource continuationSource) {
            this.f45403c = m00.b.c(continuationSource);
        }

        public final int a(int i11) {
            int i12;
            int i13 = 0;
            if (i11 > 0) {
                int length = this.f45404d.length;
                while (true) {
                    length--;
                    i12 = this.f45405e;
                    if (length < i12 || i11 <= 0) {
                        break;
                    }
                    Header header = this.f45404d[length];
                    m.c(header);
                    int i14 = header.f45397c;
                    i11 -= i14;
                    this.f45407g -= i14;
                    this.f45406f--;
                    i13++;
                }
                Header[] headerArr = this.f45404d;
                System.arraycopy(headerArr, i12 + 1, headerArr, i12 + 1 + i13, this.f45406f);
                this.f45405e += i13;
            }
            return i13;
        }

        public final l b(int i11) throws IOException {
            if (i11 >= 0) {
                Hpack hpack = Hpack.f45398a;
                hpack.getClass();
                Header[] headerArr = Hpack.f45399b;
                if (i11 <= headerArr.length - 1) {
                    hpack.getClass();
                    return headerArr[i11].f45395a;
                }
            }
            Hpack.f45398a.getClass();
            int length = this.f45405e + 1 + (i11 - Hpack.f45399b.length);
            if (length >= 0) {
                Header[] headerArr2 = this.f45404d;
                if (length < headerArr2.length) {
                    Header header = headerArr2[length];
                    m.c(header);
                    return header.f45395a;
                }
            }
            throw new IOException("Header index too large " + (i11 + 1));
        }

        public final void c(Header header) {
            this.f45402b.add(header);
            int i11 = header.f45397c;
            int i12 = this.f45401a;
            if (i11 > i12) {
                Header[] headerArr = this.f45404d;
                ry.l.P(0, headerArr.length, null, headerArr);
                this.f45405e = this.f45404d.length - 1;
                this.f45406f = 0;
                this.f45407g = 0;
                return;
            }
            a((this.f45407g + i11) - i12);
            int i13 = this.f45406f + 1;
            Header[] headerArr2 = this.f45404d;
            if (i13 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f45405e = this.f45404d.length - 1;
                this.f45404d = headerArr3;
            }
            int i14 = this.f45405e;
            this.f45405e = i14 - 1;
            this.f45404d[i14] = header;
            this.f45406f++;
            this.f45407g += i11;
        }

        public final l d() {
            d0 source = this.f45403c;
            byte b3 = source.readByte();
            byte[] bArr = _UtilCommonKt.f45202a;
            int i11 = b3 & 255;
            int i12 = 0;
            boolean z11 = (b3 & 128) == 128;
            long jE = e(i11, 127);
            if (!z11) {
                return source.z(jE);
            }
            i iVar = new i();
            Huffman.f45487a.getClass();
            m.f(source, "source");
            Huffman.Node node = Huffman.f45490d;
            Huffman.Node node2 = node;
            int i13 = 0;
            for (long j11 = 0; j11 < jE; j11++) {
                byte b11 = source.readByte();
                byte[] bArr2 = _UtilCommonKt.f45202a;
                i12 = (i12 << 8) | (b11 & 255);
                i13 += 8;
                while (i13 >= 8) {
                    Huffman.Node[] nodeArr = node2.f45491a;
                    m.c(nodeArr);
                    node2 = nodeArr[(i12 >>> (i13 - 8)) & 255];
                    m.c(node2);
                    if (node2.f45491a == null) {
                        iVar.J(node2.f45492b);
                        i13 -= node2.f45493c;
                        node2 = node;
                    } else {
                        i13 -= 8;
                    }
                }
            }
            while (i13 > 0) {
                Huffman.Node[] nodeArr2 = node2.f45491a;
                m.c(nodeArr2);
                Huffman.Node node3 = nodeArr2[(i12 << (8 - i13)) & 255];
                m.c(node3);
                int i14 = node3.f45493c;
                if (node3.f45491a != null || i14 > i13) {
                    break;
                }
                iVar.J(node3.f45492b);
                i13 -= i14;
                node2 = node;
            }
            return iVar.z(iVar.f40718b);
        }

        public final int e(int i11, int i12) {
            int i13 = i11 & i12;
            if (i13 < i12) {
                return i13;
            }
            int i14 = 0;
            while (true) {
                byte b3 = this.f45403c.readByte();
                byte[] bArr = _UtilCommonKt.f45202a;
                int i15 = b3 & 255;
                if ((b3 & 128) == 0) {
                    return i12 + (i15 << i14);
                }
                i12 += (b3 & 127) << i14;
                i14 += 7;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f45408a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45410c;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f45414g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f45415h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45409b = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45411d = 4096;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Header[] f45412e = new Header[8];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f45413f = 7;

        public Writer(i iVar) {
            this.f45408a = iVar;
        }

        public final void a(int i11) {
            int i12;
            if (i11 > 0) {
                int length = this.f45412e.length - 1;
                int i13 = 0;
                while (true) {
                    i12 = this.f45413f;
                    if (length < i12 || i11 <= 0) {
                        break;
                    }
                    Header header = this.f45412e[length];
                    m.c(header);
                    i11 -= header.f45397c;
                    int i14 = this.f45415h;
                    Header header2 = this.f45412e[length];
                    m.c(header2);
                    this.f45415h = i14 - header2.f45397c;
                    this.f45414g--;
                    i13++;
                    length--;
                }
                Header[] headerArr = this.f45412e;
                int i15 = i12 + 1;
                System.arraycopy(headerArr, i15, headerArr, i15 + i13, this.f45414g);
                Header[] headerArr2 = this.f45412e;
                int i16 = this.f45413f + 1;
                Arrays.fill(headerArr2, i16, i16 + i13, (Object) null);
                this.f45413f += i13;
            }
        }

        public final void b(Header header) {
            int i11 = header.f45397c;
            int i12 = this.f45411d;
            if (i11 > i12) {
                Header[] headerArr = this.f45412e;
                ry.l.P(0, headerArr.length, null, headerArr);
                this.f45413f = this.f45412e.length - 1;
                this.f45414g = 0;
                this.f45415h = 0;
                return;
            }
            a((this.f45415h + i11) - i12);
            int i13 = this.f45414g + 1;
            Header[] headerArr2 = this.f45412e;
            if (i13 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f45413f = this.f45412e.length - 1;
                this.f45412e = headerArr3;
            }
            int i14 = this.f45413f;
            this.f45413f = i14 - 1;
            this.f45412e[i14] = header;
            this.f45414g++;
            this.f45415h += i11;
        }

        public final void c(l data) throws EOFException {
            m.f(data, "data");
            Huffman.f45487a.getClass();
            int iE = data.e();
            long j11 = 0;
            long j12 = 0;
            for (int i11 = 0; i11 < iE; i11++) {
                byte bK = data.k(i11);
                byte[] bArr = _UtilCommonKt.f45202a;
                j12 += (long) Huffman.f45489c[bK & 255];
            }
            int i12 = (int) ((j12 + ((long) 7)) >> 3);
            int iE2 = data.e();
            i iVar = this.f45408a;
            if (i12 >= iE2) {
                e(data.e(), 127, 0);
                iVar.I(data);
                return;
            }
            i iVar2 = new i();
            Huffman.f45487a.getClass();
            int iE3 = data.e();
            int i13 = 0;
            for (int i14 = 0; i14 < iE3; i14++) {
                byte bK2 = data.k(i14);
                byte[] bArr2 = _UtilCommonKt.f45202a;
                int i15 = bK2 & 255;
                int i16 = Huffman.f45488b[i15];
                byte b3 = Huffman.f45489c[i15];
                j11 = (j11 << b3) | ((long) i16);
                i13 += b3;
                while (i13 >= 8) {
                    i13 -= 8;
                    iVar2.J((int) (j11 >> i13));
                }
            }
            if (i13 > 0) {
                iVar2.J((int) ((j11 << (8 - i13)) | (255 >>> i13)));
            }
            l lVarZ = iVar2.z(iVar2.f40718b);
            e(lVarZ.e(), 127, 128);
            iVar.I(lVarZ);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006e  */
        public final void d(ArrayList arrayList) throws EOFException {
            int length;
            int length2;
            if (this.f45410c) {
                int i11 = this.f45409b;
                if (i11 < this.f45411d) {
                    e(i11, 31, 32);
                }
                this.f45410c = false;
                this.f45409b = Integer.MAX_VALUE;
                e(this.f45411d, 31, 32);
            }
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                Header header = (Header) arrayList.get(i12);
                l lVarT = header.f45395a.t();
                l lVar = header.f45396b;
                Hpack.f45398a.getClass();
                Integer num = (Integer) Hpack.f45400c.get(lVarT);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        Header[] headerArr = Hpack.f45399b;
                        if (m.a(headerArr[iIntValue].f45396b, lVar)) {
                            length = length2;
                        } else if (m.a(headerArr[length2].f45396b, lVar)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        } else {
                            length = length2;
                            length2 = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.f45412e.length;
                    for (int i13 = this.f45413f + 1; i13 < length3; i13++) {
                        Header header2 = this.f45412e[i13];
                        m.c(header2);
                        if (m.a(header2.f45395a, lVarT)) {
                            Header header3 = this.f45412e[i13];
                            m.c(header3);
                            if (m.a(header3.f45396b, lVar)) {
                                int i14 = i13 - this.f45413f;
                                Hpack.f45398a.getClass();
                                length2 = Hpack.f45399b.length + i14;
                                break;
                            } else if (length == -1) {
                                int i15 = i13 - this.f45413f;
                                Hpack.f45398a.getClass();
                                length = i15 + Hpack.f45399b.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    e(length2, 127, 128);
                } else if (length == -1) {
                    this.f45408a.J(64);
                    c(lVarT);
                    c(lVar);
                    b(header);
                } else if (!lVarT.p(Header.f45389d) || m.a(Header.f45394i, lVarT)) {
                    e(length, 63, 64);
                    c(lVar);
                    b(header);
                } else {
                    e(length, 15, 0);
                    c(lVar);
                }
            }
        }

        public final void e(int i11, int i12, int i13) {
            i iVar = this.f45408a;
            if (i11 < i12) {
                iVar.J(i11 | i13);
                return;
            }
            iVar.J(i13 | i12);
            int i14 = i11 - i12;
            while (i14 >= 128) {
                iVar.J(128 | (i14 & 127));
                i14 >>>= 7;
            }
            iVar.J(i14);
        }
    }

    private Hpack() {
    }

    public static void a(l name) throws IOException {
        m.f(name, "name");
        int iE = name.e();
        for (int i11 = 0; i11 < iE; i11++) {
            byte bK = name.k(i11);
            if (65 <= bK && bK < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.v()));
            }
        }
    }

    static {
        Header header = new Header(Header.f45394i, BuildConfig.VERSION_NAME);
        l lVar = Header.f45391f;
        Header header2 = new Header(lVar, "GET");
        Header header3 = new Header(lVar, "POST");
        l lVar2 = Header.f45392g;
        Header header4 = new Header(lVar2, "/");
        Header header5 = new Header(lVar2, "/index.html");
        l lVar3 = Header.f45393h;
        Header header6 = new Header(lVar3, "http");
        Header header7 = new Header(lVar3, Constants.SCHEME);
        l lVar4 = Header.f45390e;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header(lVar4, "200"), new Header(lVar4, "204"), new Header(lVar4, "206"), new Header(lVar4, "304"), new Header(lVar4, "400"), new Header(lVar4, "404"), new Header(lVar4, "500"), new Header("accept-charset", BuildConfig.VERSION_NAME), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", BuildConfig.VERSION_NAME), new Header("accept-ranges", BuildConfig.VERSION_NAME), new Header("accept", BuildConfig.VERSION_NAME), new Header("access-control-allow-origin", BuildConfig.VERSION_NAME), new Header("age", BuildConfig.VERSION_NAME), new Header("allow", BuildConfig.VERSION_NAME), new Header("authorization", BuildConfig.VERSION_NAME), new Header("cache-control", BuildConfig.VERSION_NAME), new Header("content-disposition", BuildConfig.VERSION_NAME), new Header("content-encoding", BuildConfig.VERSION_NAME), new Header("content-language", BuildConfig.VERSION_NAME), new Header("content-length", BuildConfig.VERSION_NAME), new Header("content-location", BuildConfig.VERSION_NAME), new Header("content-range", BuildConfig.VERSION_NAME), new Header("content-type", BuildConfig.VERSION_NAME), new Header("cookie", BuildConfig.VERSION_NAME), new Header("date", BuildConfig.VERSION_NAME), new Header("etag", BuildConfig.VERSION_NAME), new Header("expect", BuildConfig.VERSION_NAME), new Header("expires", BuildConfig.VERSION_NAME), new Header("from", BuildConfig.VERSION_NAME), new Header("host", BuildConfig.VERSION_NAME), new Header("if-match", BuildConfig.VERSION_NAME), new Header("if-modified-since", BuildConfig.VERSION_NAME), new Header("if-none-match", BuildConfig.VERSION_NAME), new Header("if-range", BuildConfig.VERSION_NAME), new Header("if-unmodified-since", BuildConfig.VERSION_NAME), new Header(scqhIrGXy.PYo, BuildConfig.VERSION_NAME), new Header("link", BuildConfig.VERSION_NAME), new Header(RequestParameters.SUBRESOURCE_LOCATION, BuildConfig.VERSION_NAME), new Header("max-forwards", BuildConfig.VERSION_NAME), new Header("proxy-authenticate", BuildConfig.VERSION_NAME), new Header("proxy-authorization", BuildConfig.VERSION_NAME), new Header("range", BuildConfig.VERSION_NAME), new Header(RequestParameters.SUBRESOURCE_REFERER, BuildConfig.VERSION_NAME), new Header("refresh", BuildConfig.VERSION_NAME), new Header("retry-after", BuildConfig.VERSION_NAME), new Header("server", BuildConfig.VERSION_NAME), new Header("set-cookie", BuildConfig.VERSION_NAME), new Header("strict-transport-security", BuildConfig.VERSION_NAME), new Header("transfer-encoding", BuildConfig.VERSION_NAME), new Header("user-agent", BuildConfig.VERSION_NAME), new Header("vary", BuildConfig.VERSION_NAME), new Header("via", BuildConfig.VERSION_NAME), new Header("www-authenticate", BuildConfig.VERSION_NAME)};
        f45399b = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length, 1.0f);
        int length = headerArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (!linkedHashMap.containsKey(headerArr[i11].f45395a)) {
                linkedHashMap.put(headerArr[i11].f45395a, Integer.valueOf(i11));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        m.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        f45400c = mapUnmodifiableMap;
    }
}
