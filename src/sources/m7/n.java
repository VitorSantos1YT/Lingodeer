package m7;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import b7.f0;
import b7.v;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import hh.p0;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import ko.Zea.ealNNtLp;
import pt.ImS.aYZzTH;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f40987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f40988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f40989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f40991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f40992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f40995l;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        this.f40984a = str;
        this.f40985b = str2;
        this.f40986c = str3;
        this.f40987d = codecCapabilities;
        this.f40990g = z11;
        this.f40988e = z14;
        this.f40989f = z15;
        this.f40991h = z16;
        this.f40992i = d0.n(str2);
        this.f40995l = -3.4028235E38f;
        this.f40993j = -1;
        this.f40994k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d5) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(f0.e(i11, widthAlignment) * widthAlignment, f0.e(i12, heightAlignment) * heightAlignment);
        int i13 = point.x;
        int i14 = point.y;
        if (d5 == -1.0d || d5 < 1.0d) {
            return videoCapabilities.isSizeSupported(i13, i14);
        }
        double dFloor = Math.floor(d5);
        if (!videoCapabilities.areSizeAndRateSupported(i13, i14, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i13, i14);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    public static n i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z17 = z14 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z15 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z15 = false;
            } else {
                z15 = true;
            }
        }
        return new n(str, str2, str3, codecCapabilities, z11, z12, z13, z16, z17, z15);
    }

    public final f7.g b(y6.p pVar, y6.p pVar2) {
        y6.p pVar3;
        y6.p pVar4;
        int i11;
        String str = pVar.f57291n;
        y6.g gVar = pVar.D;
        String str2 = pVar2.f57291n;
        y6.g gVar2 = pVar2.D;
        int i12 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.f40992i) {
            if (pVar.f57303z != pVar2.f57303z) {
                i12 |= 1024;
            }
            boolean z11 = (pVar.f57298u == pVar2.f57298u && pVar.f57299v == pVar2.f57299v) ? false : true;
            if (!this.f40988e && z11) {
                i12 |= 512;
            }
            if ((!y6.g.e(gVar) || !y6.g.e(gVar2)) && !Objects.equals(gVar, gVar2)) {
                i12 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f40984a) && !pVar.b(pVar2)) {
                i12 |= 2;
            }
            int i13 = pVar.f57300w;
            if (i13 != -1 && (i11 = pVar.f57301x) != -1 && i13 == pVar2.f57300w && i11 == pVar2.f57301x && z11) {
                i12 |= 2;
            }
            if (i12 == 0) {
                return new f7.g(this.f40984a, pVar, pVar2, pVar.b(pVar2) ? 3 : 2, 0);
            }
            pVar3 = pVar;
            pVar4 = pVar2;
        } else {
            pVar3 = pVar;
            pVar4 = pVar2;
            if (pVar3.F != pVar4.F) {
                i12 |= 4096;
            }
            if (pVar3.G != pVar4.G) {
                i12 |= OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            if (pVar3.H != pVar4.H) {
                i12 |= 16384;
            }
            String str3 = this.f40985b;
            if (i12 == 0 && "audio/mp4a-latm".equals(str3)) {
                HashMap map = s.f41035a;
                Pair pairB = b7.d.b(pVar3);
                Pair pairB2 = b7.d.b(pVar4);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new f7.g(this.f40984a, pVar3, pVar4, 3, 0);
                    }
                }
            }
            if (!pVar3.b(pVar4)) {
                i12 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i12 |= 2;
            }
            if (i12 == 0) {
                return new f7.g(this.f40984a, pVar3, pVar4, 1, 0);
            }
        }
        return new f7.g(this.f40984a, pVar3, pVar4, 0, i12);
    }

    public final boolean d(y6.p pVar) {
        return (Objects.equals(pVar.f57291n, "audio/flac") && pVar.H == 22 && Build.VERSION.SDK_INT < 34 && this.f40984a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean f(y6.p pVar) {
        if (this.f40992i) {
            return this.f40988e;
        }
        HashMap map = s.f41035a;
        Pair pairB = b7.d.b(pVar);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    public final boolean g(int i11, int i12, double d5) {
        String str;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f40987d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            int iA = (i13 < 29 || ((bool = ve.i.f54006b) != null && bool.booleanValue())) ? 0 : c3.c.a(videoCapabilities, i11, i12, d5);
            if (iA != 2) {
                if (iA == 1) {
                    StringBuilder sbK = w4.c.k("sizeAndRate.cover, ", i11, "x", i12, "@");
                    sbK.append(d5);
                    h(sbK.toString());
                    return false;
                }
                if (!a(videoCapabilities, i11, i12, d5)) {
                    if (i11 < i12) {
                        str = this.f40984a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sbK2 = w4.c.k("sizeAndRate.rotated, ", i11, "x", i12, "@");
                            sbK2.append(d5);
                            StringBuilder sbS = defpackage.e.s("AssumedSupport [", sbK2.toString(), "] [", str, ", ");
                            sbS.append(this.f40985b);
                            sbS.append("] [");
                            sbS.append(f0.f3975a);
                            sbS.append("]");
                            b7.a.n(sbS.toString());
                            return true;
                        }
                        StringBuilder sbK3 = w4.c.k("sizeAndRate.rotated, ", i11, "x", i12, "@");
                        sbK3.append(d5);
                        StringBuilder sbS2 = defpackage.e.s("AssumedSupport [", sbK3.toString(), "] [", str, ", ");
                        sbS2.append(this.f40985b);
                        sbS2.append("] [");
                        sbS2.append(f0.f3975a);
                        sbS2.append("]");
                        b7.a.n(sbS2.toString());
                        return true;
                    }
                    StringBuilder sbK4 = w4.c.k("sizeAndRate.support, ", i11, "x", i12, "@");
                    sbK4.append(d5);
                    h(sbK4.toString());
                    return false;
                }
            }
        } else if (!a(videoCapabilities, i11, i12, d5)) {
            if (i11 < i12) {
                str = this.f40984a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i12, i11, d5)) {
                    StringBuilder sbK5 = w4.c.k("sizeAndRate.rotated, ", i11, "x", i12, "@");
                    sbK5.append(d5);
                    StringBuilder sbS3 = defpackage.e.s("AssumedSupport [", sbK5.toString(), "] [", str, ", ");
                    sbS3.append(this.f40985b);
                    sbS3.append("] [");
                    sbS3.append(f0.f3975a);
                    sbS3.append("]");
                    b7.a.n(sbS3.toString());
                    return true;
                }
            }
            StringBuilder sbK6 = w4.c.k("sizeAndRate.support, ", i11, "x", i12, "@");
            sbK6.append(d5);
            h(sbK6.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder sbQ = p0.q("NoSupport [", str, "] [");
        sbQ.append(this.f40984a);
        sbQ.append(", ");
        sbQ.append(this.f40985b);
        sbQ.append("] [");
        sbQ.append(f0.f3975a);
        sbQ.append("]");
        b7.a.n(sbQ.toString());
    }

    public final String toString() {
        return this.f40984a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[PHI: r2
      0x00c5: PHI (r2v2 android.util.Pair) = (r2v1 android.util.Pair), (r2v1 android.util.Pair), (r2v1 android.util.Pair), (r2v14 android.util.Pair) binds: [B:3:0x0010, B:5:0x0018, B:10:0x002c, B:37:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(y6.p pVar, boolean z11) {
        byte b3;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Pair pair;
        String strA;
        HashMap map = s.f41035a;
        Pair pairB = b7.d.b(pVar);
        String str = pVar.f57291n;
        String str2 = this.f40986c;
        if (str == null || !str.equals("video/mv-hevc")) {
            b3 = -1;
        } else {
            String strO = d0.o(str2);
            if (strO.equals("video/mv-hevc")) {
                return true;
            }
            if (strO.equals("video/hevc")) {
                List list = pVar.f57294q;
                int i11 = 0;
                loop0: while (true) {
                    if (i11 >= list.size()) {
                        pair = null;
                        strA = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i11);
                    int length = bArr.length;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
                        ImmutableList.Builder builder = new ImmutableList.Builder();
                        int i12 = 0;
                        while (i12 < bArr.length) {
                            int iB = c7.q.b(bArr, i12, bArr.length, zArr);
                            if (iB != bArr.length) {
                                builder.h(Integer.valueOf(iB));
                            }
                            i12 = iB + 3;
                        }
                        ImmutableList immutableListJ = builder.j();
                        for (int i13 = 0; i13 < immutableListJ.size(); i13++) {
                            if (((Integer) immutableListJ.get(i13)).intValue() + 3 < length) {
                                v vVar = new v(bArr, ((Integer) immutableListJ.get(i13)).intValue() + 3, length);
                                c7.j jVarE = c7.q.e(vVar);
                                if (jVarE.f6660a == 33 && jVarE.f6661b == 0) {
                                    vVar.t(4);
                                    int i14 = vVar.i(3);
                                    vVar.s();
                                    pair = null;
                                    c7.k kVarF = c7.q.f(vVar, true, i14, null);
                                    strA = b7.d.a(kVarF.f6663a, kVarF.f6664b, kVarF.f6665c, kVarF.f6666d, kVarF.f6667e, kVarF.f6668f);
                                    break loop0;
                                }
                            }
                        }
                    }
                    i11++;
                }
                if (strA == null) {
                    pairB = pair;
                    b3 = -1;
                } else {
                    String strTrim = strA.trim();
                    String str3 = f0.f3975a;
                    b3 = -1;
                    pairB = b7.d.c(strA, strTrim.split("\\.", -1), pVar.D);
                }
            } else {
                b3 = -1;
            }
        }
        if (pairB == null) {
            return true;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        int iIntValue2 = ((Integer) pairB.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str);
        String str4 = this.f40985b;
        if (zEquals) {
            str4.getClass();
            switch (str4.hashCode()) {
                case -1662735862:
                    if (str4.equals(ealNNtLp.EUZylMbsto)) {
                        b3 = 0;
                    }
                    break;
                case -1662541442:
                    if (str4.equals("video/hevc")) {
                        b3 = 1;
                    }
                    break;
                case 1331836730:
                    if (str4.equals("video/avc")) {
                        b3 = 2;
                    }
                    break;
            }
            switch (b3) {
                case 0:
                case 1:
                    iIntValue = 2;
                    break;
                case 2:
                    iIntValue = 8;
                    break;
            }
            iIntValue2 = 0;
        }
        if (!this.f40992i && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f40987d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == iIntValue && (codecProfileLevel.level >= iIntValue2 || !z11)) {
                if (!"video/hevc".equals(str4) || 2 != iIntValue) {
                    return true;
                }
                String str5 = Build.DEVICE;
                if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                    return true;
                }
            }
        }
        h("codec.profileLevel, " + pVar.f57289k + ", " + str2);
        return false;
    }

    public final boolean e(y6.p pVar) {
        int i11;
        int i12;
        String str = pVar.f57291n;
        String str2 = this.f40985b;
        if ((!str2.equals(str) && !str2.equals(s.b(pVar))) || !c(pVar, true) || !d(pVar)) {
            return false;
        }
        if (this.f40992i) {
            int i13 = pVar.f57298u;
            if (i13 > 0 && (i12 = pVar.f57299v) > 0) {
                return g(i13, i12, pVar.f57302y);
            }
        } else {
            int i14 = pVar.G;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f40987d;
            if (i14 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i14)) {
                    h("sampleRate.support, " + i14);
                    return false;
                }
            }
            int i15 = pVar.F;
            if (i15 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !aYZzTH.edxpnddpKzX.equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i11 = 6;
                    } else {
                        i11 = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    StringBuilder sbQ = defpackage.e.q(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.f40984a, ", [", " to ");
                    sbQ.append(i11);
                    sbQ.append("]");
                    b7.a.B(sbQ.toString());
                    maxInputChannelCount = i11;
                }
                if (maxInputChannelCount < i15) {
                    h("channelCount.support, " + i15);
                    return false;
                }
            }
        }
        return true;
    }
}
