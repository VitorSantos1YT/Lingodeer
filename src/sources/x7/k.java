package x7;

import a0.b2;
import android.net.Uri;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import qp.o2;
import re.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f55905e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o2 f55906f = new o2(new se.n(22));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o2 f55907t = new o2(new se.n(23));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImmutableList f55908a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55911d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g0 f55910c = new g0(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f55909b = true;

    public final void a(int i11, ArrayList arrayList) {
        switch (i11) {
            case 0:
                arrayList.add(new e9.a());
                break;
            case 1:
                arrayList.add(new e9.c());
                break;
            case 2:
                arrayList.add(new e9.d());
                break;
            case 3:
                arrayList.add(new y7.a());
                break;
            case 4:
                m mVarP = f55906f.p(0);
                if (mVarP == null) {
                    arrayList.add(new c8.c());
                } else {
                    arrayList.add(mVarP);
                }
                break;
            case 5:
                arrayList.add(new d8.b());
                break;
            case 6:
                arrayList.add(new p8.d(this.f55910c, this.f55909b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new q8.d());
                break;
            case 8:
                arrayList.add(new r8.g(this.f55910c, this.f55909b ? 0 : 32, ImmutableList.s(), null));
                arrayList.add(new r8.j(this.f55910c, this.f55909b ? 0 : 16));
                break;
            case 9:
                arrayList.add(new s8.d());
                break;
            case 10:
                arrayList.add(new e9.a0());
                break;
            case 11:
                if (this.f55908a == null) {
                    this.f55908a = ImmutableList.s();
                }
                arrayList.add(new e9.d0(!this.f55909b ? 1 : 0, this.f55910c, new b7.b0(0L), new b2(this.f55908a, 10)));
                break;
            case 12:
                arrayList.add(new f9.d());
                break;
            case 14:
                arrayList.add(new b8.a(this.f55911d));
                break;
            case 15:
                m mVarP2 = f55907t.p(new Object[0]);
                if (mVarP2 != null) {
                    arrayList.add(mVarP2);
                }
                break;
            case 16:
                arrayList.add(new z7.b(!this.f55909b ? 1 : 0, this.f55910c));
                break;
            case 17:
                arrayList.add(new b8.a(1, (byte) 0));
                break;
            case 18:
                arrayList.add(new a8.a(2));
                break;
            case 19:
                arrayList.add(new b8.a(0, (byte) 0));
                break;
            case 20:
                arrayList.add(new a8.a(1));
                break;
            case 21:
                arrayList.add(new a8.a(0));
                break;
        }
    }

    @Override // x7.p
    public final synchronized m[] c() {
        return g(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0240 A[Catch: all -> 0x0244, TRY_ENTER, TryCatch #0 {all -> 0x0244, blocks: (B:4:0x0003, B:6:0x0019, B:9:0x0020, B:169:0x0240, B:172:0x0246, B:175:0x024e, B:178:0x0254, B:181:0x025a, B:182:0x025d, B:183:0x0260, B:14:0x002d), top: B:188:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0254 A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:4:0x0003, B:6:0x0019, B:9:0x0020, B:169:0x0240, B:172:0x0246, B:175:0x024e, B:178:0x0254, B:181:0x025a, B:182:0x025d, B:183:0x0260, B:14:0x002d), top: B:188:0x0003 }] */
    /* JADX WARN: switch over string: strings are not added: [[image/heic], [image/heif]] */
    @Override // x7.p
    public final synchronized m[] g(Uri uri, Map map) {
        ArrayList arrayList;
        int i11;
        int iA;
        int i12;
        int i13;
        try {
            int[] iArr = f55905e;
            arrayList = new ArrayList(21);
            List list = (List) map.get(HttpHeaders.CONTENT_TYPE);
            String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
            if (str != null) {
                String strO = y6.d0.o(str);
                strO.getClass();
                i11 = 20;
                switch (strO) {
                    case "audio/eac3-joc":
                    case "audio/ac3":
                    case "audio/eac3":
                        i11 = 0;
                        break;
                    case "video/mp2p":
                        i11 = 10;
                        break;
                    case "video/mp2t":
                        i11 = 11;
                        break;
                    case "video/webm":
                    case "audio/x-matroska":
                    case "application/webm":
                    case "audio/webm":
                    case "video/x-matroska":
                        i11 = 6;
                        break;
                    case "audio/amr-wb":
                    case "audio/amr":
                    case "audio/3gpp":
                        i11 = 3;
                        break;
                    case "image/avif":
                        i11 = 21;
                        break;
                    case "image/jpeg":
                        i11 = 14;
                        break;
                    case "image/webp":
                        i11 = 18;
                        break;
                    case "application/mp4":
                    case "audio/mp4":
                    case "video/mp4":
                        i11 = 8;
                        break;
                    case "video/x-msvideo":
                        i11 = 16;
                        break;
                    case "text/vtt":
                        i11 = 13;
                        break;
                    case "image/bmp":
                        i11 = 19;
                        break;
                    case "image/png":
                        i11 = 17;
                        break;
                    case "video/x-flv":
                        i11 = 5;
                        break;
                    case "audio/ac4":
                        i11 = 1;
                        break;
                    case "audio/ogg":
                        i11 = 9;
                        break;
                    case "audio/wav":
                        i11 = 12;
                        break;
                    case "audio/flac":
                        i11 = 4;
                        break;
                    case "audio/midi":
                        i11 = 15;
                        break;
                    case "audio/mpeg":
                        i11 = 7;
                        break;
                }
                if (i11 != -1) {
                    a(i11, arrayList);
                }
                iA = ob.f.A(uri);
                if (iA != -1 && iA != i11) {
                    a(iA, arrayList);
                }
                for (i12 = 0; i12 < 21; i12++) {
                    i13 = iArr[i12];
                    if (i13 == i11 && i13 != iA) {
                        a(i13, arrayList);
                    }
                }
            }
            i11 = -1;
            if (i11 != -1) {
                a(i11, arrayList);
            }
            iA = ob.f.A(uri);
            if (iA != -1) {
                a(iA, arrayList);
            }
            while (i12 < 21) {
                i13 = iArr[i12];
                if (i13 == i11) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (m[]) arrayList.toArray(new m[0]);
    }
}
