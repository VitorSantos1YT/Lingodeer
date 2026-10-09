package m7;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.android.billingclient.api.c0;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f41035a = new HashMap();

    public static String b(y6.p pVar) {
        Pair pairB;
        String str = pVar.f57291n;
        String str2 = pVar.f57291n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairB = b7.d.b(pVar)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List d(String str, boolean z11, boolean z12) {
        try {
            q qVar = new q(str, z11, z12);
            HashMap map = f41035a;
            List list = (List) map.get(qVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListE = e(qVar, new c0(z11, z12, str.equals("video/mv-hevc")));
            if (z11) {
                arrayListE.isEmpty();
            }
            a(arrayListE, str);
            ImmutableList immutableListN = ImmutableList.n(arrayListE);
            map.put(qVar, immutableListN);
            return immutableListN;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    public static ArrayList e(q qVar, c0 c0Var) throws MediaCodecUtil$DecoderQueryException {
        int i11;
        String strC;
        String str;
        q qVar2 = qVar;
        int i12 = c0Var.f7470b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = qVar2.f41032a;
            boolean z11 = qVar2.f41033b;
            if (((MediaCodecInfo[]) c0Var.f7471c) == null) {
                c0Var.f7471c = new MediaCodecList(i12).getCodecInfos();
            }
            int length = ((MediaCodecInfo[]) c0Var.f7471c).length;
            int i13 = 0;
            while (i13 < length) {
                if (((MediaCodecInfo[]) c0Var.f7471c) == null) {
                    c0Var.f7471c = new MediaCodecList(i12).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[]) c0Var.f7471c)[i13];
                int i14 = Build.VERSION.SDK_INT;
                if (i14 < 29 || !mediaCodecInfo.isAlias()) {
                    int i15 = i13;
                    String name = mediaCodecInfo.getName();
                    if (mediaCodecInfo.isEncoder() || (strC = c(mediaCodecInfo, name, str2)) == null) {
                        i11 = i15;
                    } else {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(strC);
                            boolean zIsFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean zIsFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            boolean z12 = qVar2.f41034c;
                            if ((z12 || !zIsFeatureRequired) && (!z12 || zIsFeatureSupported)) {
                                boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                                boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                if ((z11 || !zIsFeatureRequired2) && (!z11 || zIsFeatureSupported2)) {
                                    boolean zIsVendor = true;
                                    boolean zIsHardwareAccelerated = i14 >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !g(mediaCodecInfo, str2);
                                    i11 = i15;
                                    boolean zG = g(mediaCodecInfo, str2);
                                    boolean z13 = zIsHardwareAccelerated;
                                    if (i14 >= 29) {
                                        zIsVendor = mediaCodecInfo.isVendor();
                                    } else {
                                        String strC2 = Ascii.c(mediaCodecInfo.getName());
                                        if (strC2.startsWith("omx.google.") || strC2.startsWith("c2.android.") || strC2.startsWith("c2.google.")) {
                                            zIsVendor = false;
                                        }
                                    }
                                    if (z11 != zIsFeatureSupported2) {
                                        continue;
                                    } else {
                                        str = strC;
                                        try {
                                            arrayList.add(n.i(name, str2, str, capabilitiesForType, z13, zG, zIsVendor, false));
                                        } catch (Exception e8) {
                                            e = e8;
                                            b7.a.o("Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                } else {
                                    i11 = i15;
                                }
                            } else {
                                i11 = i15;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            str = strC;
                        }
                    }
                } else {
                    i11 = i13;
                }
                i13 = i11 + 1;
                qVar2 = qVar;
            }
            return arrayList;
        } catch (Exception e11) {
            throw new MediaCodecUtil$DecoderQueryException("Failed to query underlying media codecs", e11);
        }
    }

    public static List f(i iVar, y6.p pVar, boolean z11, boolean z12) {
        List listB = iVar.b(pVar.f57291n, z11, z12);
        String strB = b(pVar);
        List listS = strB == null ? ImmutableList.s() : iVar.b(strB, z11, z12);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.f(listB);
        builder.f(listS);
        return builder.j();
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (d0.k(str)) {
            return true;
        }
        String strC = Ascii.c(mediaCodecInfo.getName());
        if (strC.startsWith("arc.")) {
            return false;
        }
        if (strC.startsWith("omx.google.") || strC.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strC.startsWith("omx.sec.") && strC.contains(".sw.")) || strC.equals("omx.qcom.video.decoder.hevcswvdec") || strC.startsWith("c2.android.") || strC.startsWith("c2.google.")) {
            return true;
        }
        return (strC.startsWith("omx.") || strC.startsWith("c2.")) ? false : true;
    }

    public static void a(ArrayList arrayList, String str) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).f40984a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.i(bjXGJ.cETJIVKn, "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new com.google.android.material.button.a(new i(), 6));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).f40984a)) {
            return;
        }
        arrayList.add((n) arrayList.remove(0));
    }
}
