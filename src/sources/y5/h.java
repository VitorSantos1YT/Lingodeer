package y5;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.google.logging.type.LogSeverity;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fa.EQx.nuRcCS;
import hh.p0;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import lt.AJC.PQgum;
import mf.sOm.txBUGYhC;
import nv.p;
import sz.xej.iFLeRCXvYCGdPW;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final e U;
    public static final e[][] V;
    public static final e[] W;
    public static final HashMap[] X;
    public static final HashMap[] Y;
    public static final HashSet Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final HashMap f57110a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Charset f57111b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final byte[] f57112c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final byte[] f57113d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Pattern f57114e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Pattern f57115f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Pattern f57116g0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f57125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetManager.AssetInputStream f57126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f57127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap[] f57128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f57129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteOrder f57130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f57131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f57132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f57133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f57134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f57135l;
    public byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f57136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f57137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f57138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f57139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f57140r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f57141s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f57117t = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final List f57118u = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final List f57119v = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f57120w = {8, 8, 8};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f57121x = {8};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f57122y = {-1, -40, -1};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f57123z = {102, 116, 121, 112};
    public static final byte[] A = {109, 105, 102, 49};
    public static final byte[] B = {104, 101, 105, 99};
    public static final byte[] C = {79, 76, 89, 77, 80, 0};
    public static final byte[] D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] E = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] F = {101, 88, 73, 102};
    public static final byte[] G = {73, 72, 68, 82};
    public static final byte[] H = {73, 69, 78, 68};
    public static final byte[] I = {82, 73, 70, 70};
    public static final byte[] J = {87, 69, 66, 80};
    public static final byte[] K = {69, 88, 73, 70};
    public static final byte[] L = {-99, 1, 42};
    public static final byte[] M = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] N = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] O = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] P = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] R = {BuildConfig.VERSION_NAME, "BYTE", "STRING", "USHORT", "ULONG", iFLeRCXvYCGdPW.YWTpBVMAOSff, "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", kHfjNGauVgdF.iBfYkQ, "IFD"};
    public static final int[] S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] T = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", BaseQuickAdapter.HEADER_VIEW, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e(nuRcCS.WoEtYyo, LogSeverity.ALERT_VALUE, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e(PQgum.zEBNoGDjf, 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e(PQgum.ypGmQGmsebtAUv, 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", BaseQuickAdapter.HEADER_VIEW, 3, 4), new e(xTCJ.YaHvJ, 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        U = new e("StripOffsets", BaseQuickAdapter.HEADER_VIEW, 3);
        V = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e(EHjhWcesDUIsIw.kJudWnUJMkMier, 55, 3)}};
        W = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        X = new HashMap[10];
        Y = new HashMap[10];
        Z = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f57110a0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f57111b0 = charsetForName;
        f57112c0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f57113d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i11 = 0;
        while (true) {
            e[][] eVarArr6 = V;
            if (i11 >= eVarArr6.length) {
                HashMap map = f57110a0;
                e[] eVarArr7 = W;
                map.put(Integer.valueOf(eVarArr7[0].f57104a), 5);
                map.put(Integer.valueOf(eVarArr7[1].f57104a), 1);
                map.put(Integer.valueOf(eVarArr7[2].f57104a), 2);
                map.put(Integer.valueOf(eVarArr7[3].f57104a), 3);
                map.put(Integer.valueOf(eVarArr7[4].f57104a), 7);
                map.put(Integer.valueOf(eVarArr7[5].f57104a), 8);
                Pattern.compile(".*[1-9].*");
                f57114e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f57115f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f57116g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            X[i11] = new HashMap();
            Y[i11] = new HashMap();
            for (e eVar : eVarArr6[i11]) {
                X[i11].put(Integer.valueOf(eVar.f57104a), eVar);
                Y[i11].put(eVar.f57105b, eVar);
            }
            i11++;
        }
    }

    public h(String str) throws Throwable {
        boolean z11;
        e[][] eVarArr = V;
        this.f57128e = new HashMap[eVarArr.length];
        this.f57129f = new HashSet(eVarArr.length);
        this.f57130g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f57126c = null;
        this.f57124a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    i.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z11 = true;
                } catch (Exception unused) {
                    z11 = false;
                }
                if (z11) {
                    this.f57125b = fileInputStream2.getFD();
                } else {
                    this.f57125b = null;
                }
                r(fileInputStream2);
                o00.a.i(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                o00.a.i(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Pair o(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairO = o(strArrSplit[0]);
            if (((Integer) pairO.first).intValue() == 2) {
                return pairO;
            }
            for (int i11 = 1; i11 < strArrSplit.length; i11++) {
                Pair pairO2 = o(strArrSplit[i11]);
                int iIntValue = (((Integer) pairO2.first).equals(pairO.first) || ((Integer) pairO2.second).equals(pairO.first)) ? ((Integer) pairO.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairO.second).intValue() == -1 || !(((Integer) pairO2.first).equals(pairO.second) || ((Integer) pairO2.second).equals(pairO.second))) ? -1 : ((Integer) pairO.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairO = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairO = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairO;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j11 = Long.parseLong(str);
                    if (j11 < 0 || j11 > 65535) {
                        return j11 < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j12 = (long) Double.parseDouble(strArrSplit2[0]);
                long j13 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j12 >= 0 && j13 >= 0) {
                    if (j12 <= 2147483647L && j13 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static ByteOrder u(b bVar) throws IOException {
        short s3 = bVar.readShort();
        if (s3 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s3 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s3));
    }

    public final void A(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (f57117t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        b bVar = new b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(bufferedOutputStream, byteOrder);
        byte[] bArr = E;
        o00.a.l(bVar, cVar, bArr.length);
        int i11 = this.f57137o;
        if (i11 == 0) {
            int i12 = bVar.readInt();
            cVar.b(i12);
            o00.a.l(bVar, cVar, i12 + 8);
        } else {
            o00.a.l(bVar, cVar, (i11 - bArr.length) - 8);
            bVar.a(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                H(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f57098a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.b((int) crc32.getValue());
                o00.a.i(byteArrayOutputStream2);
                o00.a.k(bVar, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                o00.a.i(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void B(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i11;
        int i12;
        int i13;
        ByteArrayOutputStream byteArrayOutputStream2;
        byte[] bArr;
        boolean z11;
        if (f57117t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(bufferedInputStream, byteOrder);
        c cVar = new c(bufferedOutputStream, byteOrder);
        byte[] bArr2 = I;
        o00.a.l(bVar, cVar, bArr2.length);
        byte[] bArr3 = J;
        bVar.a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream4, byteOrder);
                    int i14 = this.f57137o;
                    try {
                        try {
                            if (i14 != 0) {
                                o00.a.l(bVar, cVar2, (i14 - ((bArr2.length + 4) + bArr3.length)) - 8);
                                bVar.a(4);
                                int i15 = bVar.readInt();
                                if (i15 % 2 != 0) {
                                    i15++;
                                }
                                bVar.a(i15);
                                H(cVar2);
                            } else {
                                byte[] bArr4 = new byte[4];
                                bVar.readFully(bArr4);
                                byte[] bArr5 = M;
                                boolean zEquals = Arrays.equals(bArr4, bArr5);
                                byte[] bArr6 = O;
                                byte[] bArr7 = N;
                                if (!zEquals) {
                                    if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                                        int i16 = bVar.readInt();
                                        int i17 = i16 % 2 == 1 ? i16 + 1 : i16;
                                        byte[] bArr8 = new byte[3];
                                        boolean zEquals2 = Arrays.equals(bArr4, bArr6);
                                        boolean z12 = true;
                                        byte[] bArr9 = L;
                                        if (zEquals2) {
                                            bVar.readFully(bArr8);
                                            byte[] bArr10 = new byte[3];
                                            bVar.readFully(bArr10);
                                            if (!Arrays.equals(bArr9, bArr10)) {
                                                throw new IOException("Error checking VP8 signature");
                                            }
                                            i11 = bVar.readInt();
                                            i17 -= 10;
                                            i12 = (i11 << 18) >> 18;
                                            i13 = (i11 << 2) >> 18;
                                            z12 = false;
                                        } else if (!Arrays.equals(bArr4, bArr7)) {
                                            i11 = 0;
                                            i12 = 0;
                                            z12 = false;
                                            i13 = 0;
                                        } else {
                                            if (bVar.readByte() != 47) {
                                                throw new IOException("Error checking VP8L signature");
                                            }
                                            i11 = bVar.readInt();
                                            i12 = (i11 & 16383) + 1;
                                            i13 = ((i11 & 268419072) >>> 14) + 1;
                                            if ((i11 & 268435456) == 0) {
                                                z12 = false;
                                            }
                                            i17 -= 5;
                                        }
                                        cVar2.write(bArr5);
                                        cVar2.b(10);
                                        byte[] bArr11 = new byte[10];
                                        if (z12) {
                                            bArr11[0] = (byte) (bArr11[0] | 16);
                                        }
                                        bArr11[0] = (byte) (bArr11[0] | 8);
                                        int i18 = i12 - 1;
                                        byteArrayOutputStream2 = byteArrayOutputStream4;
                                        int i19 = i13 - 1;
                                        try {
                                            bArr11[4] = (byte) i18;
                                            bArr11[5] = (byte) (i18 >> 8);
                                            bArr11[6] = (byte) (i18 >> 16);
                                            bArr11[7] = (byte) i19;
                                            bArr11[8] = (byte) (i19 >> 8);
                                            bArr11[9] = (byte) (i19 >> 16);
                                            cVar2.write(bArr11);
                                            cVar2.write(bArr4);
                                            cVar2.b(i16);
                                            try {
                                                if (Arrays.equals(bArr4, bArr6)) {
                                                    cVar2.write(bArr8);
                                                    cVar2.write(bArr9);
                                                    cVar2.b(i11);
                                                } else {
                                                    if (Arrays.equals(bArr4, bArr7)) {
                                                        cVar2.write(47);
                                                        cVar2.b(i11);
                                                    }
                                                    o00.a.l(bVar, cVar2, i17);
                                                    H(cVar2);
                                                }
                                                o00.a.l(bVar, cVar2, i17);
                                                H(cVar2);
                                            } catch (Exception e8) {
                                                e = e8;
                                                byteArrayOutputStream3 = byteArrayOutputStream2;
                                                throw new IOException("Failed to save WebP file", e);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                byteArrayOutputStream3 = byteArrayOutputStream2;
                                                o00.a.i(byteArrayOutputStream3);
                                                throw th;
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            byteArrayOutputStream = byteArrayOutputStream2;
                                            byteArrayOutputStream3 = byteArrayOutputStream;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            byteArrayOutputStream = byteArrayOutputStream2;
                                            byteArrayOutputStream3 = byteArrayOutputStream;
                                            o00.a.i(byteArrayOutputStream3);
                                            throw th;
                                        }
                                    }
                                    o00.a.k(bVar, cVar2);
                                    cVar.b(byteArrayOutputStream2.size() + bArr3.length);
                                    cVar.write(bArr3);
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    byteArrayOutputStream.writeTo(cVar);
                                    o00.a.i(byteArrayOutputStream);
                                    return;
                                }
                                int i21 = bVar.readInt();
                                byte[] bArr12 = new byte[i21 % 2 == 1 ? i21 + 1 : i21];
                                bVar.readFully(bArr12);
                                byte b3 = (byte) (8 | bArr12[0]);
                                bArr12[0] = b3;
                                boolean z13 = ((b3 >> 1) & 1) == 1;
                                cVar2.write(bArr5);
                                cVar2.b(i21);
                                cVar2.write(bArr12);
                                if (z13) {
                                    byte[] bArr13 = P;
                                    do {
                                        bArr = new byte[4];
                                        bVar.readFully(bArr);
                                        int i22 = bVar.readInt();
                                        cVar2.write(bArr);
                                        cVar2.b(i22);
                                        if (i22 % 2 == 1) {
                                            i22++;
                                        }
                                        o00.a.l(bVar, cVar2, i22);
                                    } while (!Arrays.equals(bArr, bArr13));
                                    while (true) {
                                        byte[] bArr14 = new byte[4];
                                        try {
                                            bVar.readFully(bArr14);
                                            z11 = !Arrays.equals(bArr14, Q);
                                        } catch (EOFException unused) {
                                            z11 = true;
                                        }
                                        if (z11) {
                                            break;
                                        }
                                        int i23 = bVar.readInt();
                                        cVar2.write(bArr14);
                                        cVar2.b(i23);
                                        if (i23 % 2 == 1) {
                                            i23++;
                                        }
                                        o00.a.l(bVar, cVar2, i23);
                                    }
                                    H(cVar2);
                                } else {
                                    while (true) {
                                        byte[] bArr15 = new byte[4];
                                        bVar.readFully(bArr15);
                                        int i24 = bVar.readInt();
                                        cVar2.write(bArr15);
                                        cVar2.b(i24);
                                        if (i24 % 2 == 1) {
                                            i24++;
                                        }
                                        o00.a.l(bVar, cVar2, i24);
                                        if (Arrays.equals(bArr15, bArr6) || (bArr7 != null && Arrays.equals(bArr15, bArr7))) {
                                            break;
                                        }
                                    }
                                    H(cVar2);
                                }
                            }
                            byteArrayOutputStream.writeTo(cVar);
                            o00.a.i(byteArrayOutputStream);
                            return;
                        } catch (Exception e11) {
                            e = e11;
                            byteArrayOutputStream3 = byteArrayOutputStream;
                            throw new IOException("Failed to save WebP file", e);
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream3 = byteArrayOutputStream;
                            o00.a.i(byteArrayOutputStream3);
                            throw th;
                        }
                        byteArrayOutputStream2 = byteArrayOutputStream4;
                        o00.a.k(bVar, cVar2);
                        cVar.b(byteArrayOutputStream2.size() + bArr3.length);
                        cVar.write(bArr3);
                        byteArrayOutputStream = byteArrayOutputStream2;
                    } catch (Exception e12) {
                        e = e12;
                        byteArrayOutputStream3 = byteArrayOutputStream4;
                    } catch (Throwable th5) {
                        th = th5;
                        byteArrayOutputStream3 = byteArrayOutputStream4;
                    }
                } catch (Exception e13) {
                    e = e13;
                    byteArrayOutputStream = byteArrayOutputStream4;
                } catch (Throwable th6) {
                    th = th6;
                    byteArrayOutputStream = byteArrayOutputStream4;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0278 A[LOOP:7: B:99:0x0275->B:101:0x0278, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:103:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b5 A[LOOP:8: B:104:0x02b2->B:106:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:111:0x02de A[LOOP:9: B:109:0x02db->B:111:0x02de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:114:0x0305  */
    /* JADX WARN: Code duplicated, block: B:116:0x0311  */
    /* JADX WARN: Code duplicated, block: B:118:0x031b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0333  */
    /* JADX WARN: Code duplicated, block: B:69:0x0165  */
    /* JADX WARN: Code duplicated, block: B:73:0x016f  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a A[LOOP:1: B:74:0x0177->B:76:0x017a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x019a A[LOOP:2: B:78:0x0198->B:79:0x019a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bb A[LOOP:3: B:82:0x01b8->B:84:0x01bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x01ff A[LOOP:4: B:86:0x01fd->B:87:0x01ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x0220  */
    /* JADX WARN: Code duplicated, block: B:93:0x0231 A[LOOP:5: B:91:0x022e->B:93:0x0231, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0252 A[LOOP:6: B:95:0x0250->B:96:0x0252, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0267  */
    public final void C(String str, String str2) {
        e eVar;
        int[] iArr;
        int i11;
        int i12;
        d dVar;
        int i13;
        String[] strArrSplit;
        int[] iArr2;
        int i14;
        String[] strArrSplit2;
        long[] jArr;
        int i15;
        int i16;
        String[] strArrSplit3;
        f[] fVarArr;
        int i17;
        String[] strArrSplit4;
        int length;
        int[] iArr3;
        int i18;
        ByteBuffer byteBufferWrap;
        int i19;
        String[] strArrSplit5;
        int length2;
        f[] fVarArr2;
        int i21;
        ByteBuffer byteBufferWrap2;
        int i22;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i23;
        ByteBuffer byteBufferWrap3;
        int i24;
        String str3 = str;
        String strReplaceAll = str2;
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
            boolean zFind = f57115f0.matcher(strReplaceAll).find();
            boolean zFind2 = f57116g0.matcher(strReplaceAll).find();
            if (strReplaceAll.length() != 19) {
                return;
            }
            if (!zFind && !zFind2) {
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        int i25 = 2;
        if (strReplaceAll != null && Z.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f57114e0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = ((long) (Double.parseDouble(strReplaceAll) * 10000.0d)) + "/10000";
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        int i26 = 0;
        int i27 = 0;
        while (i27 < V.length) {
            if ((i27 != 4 || this.f57131h) && (eVar = (e) Y[i27].get(str3)) != null) {
                int i28 = eVar.f57107d;
                int i29 = eVar.f57106c;
                HashMap[] mapArr = this.f57128e;
                if (strReplaceAll != null) {
                    Pair pairO = o(strReplaceAll);
                    int i30 = -1;
                    if (i29 == ((Integer) pairO.first).intValue() || i29 == ((Integer) pairO.second).intValue()) {
                        i28 = i29;
                        iArr = S;
                        switch (i28) {
                            case 1:
                                i11 = i26;
                                i12 = i27;
                                HashMap map = mapArr[i12];
                                if (strReplaceAll.length() == 1) {
                                    i26 = i11;
                                    if (strReplaceAll.charAt(i26) < '0' && strReplaceAll.charAt(i26) <= '1') {
                                        byte[] bArr = new byte[1];
                                        bArr[i26] = (byte) (strReplaceAll.charAt(i26) - '0');
                                        dVar = new d(bArr, 1, 1);
                                    }
                                    map.put(str3, dVar);
                                } else {
                                    i26 = i11;
                                }
                                byte[] bytes = strReplaceAll.getBytes(f57111b0);
                                dVar = new d(bytes, 1, bytes.length);
                                map.put(str3, dVar);
                                break;
                            case 2:
                            case 7:
                                i13 = i26;
                                i12 = i27;
                                mapArr[i12].put(str3, d.a(strReplaceAll));
                                i26 = i13;
                                break;
                            case 3:
                                i13 = i26;
                                i12 = i27;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i14 < strArrSplit.length) {
                                    iArr2[i14] = Integer.parseInt(strArrSplit[i14]);
                                }
                                mapArr[i12].put(str3, d.f(iArr2, this.f57130g));
                                i26 = i13;
                                break;
                            case 4:
                                i13 = i26;
                                i12 = i27;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i15 < strArrSplit2.length) {
                                    jArr[i15] = Long.parseLong(strArrSplit2[i15]);
                                }
                                mapArr[i12].put(str3, d.c(jArr, this.f57130g));
                                i26 = i13;
                                break;
                            case 5:
                                i13 = i26;
                                i12 = i27;
                                i16 = -1;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                i17 = i13;
                                while (i17 < strArrSplit3.length) {
                                    String[] strArrSplit7 = strArrSplit3[i17].split("/", i16);
                                    fVarArr[i17] = new f((long) Double.parseDouble(strArrSplit7[i13]), (long) Double.parseDouble(strArrSplit7[1]));
                                    i17++;
                                    i16 = -1;
                                }
                                mapArr[i12].put(str3, d.d(fVarArr, this.f57130g));
                                i26 = i13;
                                break;
                            case 9:
                                i13 = i26;
                                i12 = i27;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i18 < strArrSplit4.length) {
                                    iArr3[i18] = Integer.parseInt(strArrSplit4[i18]);
                                }
                                HashMap map2 = mapArr[i12];
                                ByteOrder byteOrder = this.f57130g;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder);
                                while (i19 < length) {
                                    byteBufferWrap.putInt(iArr3[i19]);
                                }
                                map2.put(str3, new d(byteBufferWrap.array(), 9, length));
                                i26 = i13;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i21 = i26;
                                while (i21 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i21].split("/", i30);
                                    int i31 = i21;
                                    fVarArr2[i31] = new f((long) Double.parseDouble(strArrSplit8[i26]), (long) Double.parseDouble(strArrSplit8[1]));
                                    i21 = i31 + 1;
                                    i26 = i26;
                                    i27 = i27;
                                    i30 = -1;
                                }
                                i13 = i26;
                                i12 = i27;
                                HashMap map3 = mapArr[i12];
                                ByteOrder byteOrder2 = this.f57130g;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder2);
                                while (i22 < length2) {
                                    f fVar = fVarArr2[i22];
                                    byteBufferWrap2.putInt((int) fVar.f57108a);
                                    byteBufferWrap2.putInt((int) fVar.f57109b);
                                }
                                map3.put(str3, new d(byteBufferWrap2.array(), 10, length2));
                                i26 = i13;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i23 < strArrSplit6.length) {
                                    dArr[i23] = Double.parseDouble(strArrSplit6[i23]);
                                }
                                HashMap map4 = mapArr[i27];
                                ByteOrder byteOrder3 = this.f57130g;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder3);
                                while (i24 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i24]);
                                }
                                map4.put(str3, new d(byteBufferWrap3.array(), 12, length3));
                                break;
                        }
                    } else if (i28 != -1 && (i28 == ((Integer) pairO.first).intValue() || i28 == ((Integer) pairO.second).intValue())) {
                        iArr = S;
                        switch (i28) {
                            case 1:
                                i11 = i26;
                                i12 = i27;
                                HashMap map5 = mapArr[i12];
                                if (strReplaceAll.length() == 1) {
                                    i26 = i11;
                                    if (strReplaceAll.charAt(i26) < '0') {
                                    }
                                    map5.put(str3, dVar);
                                } else {
                                    i26 = i11;
                                }
                                byte[] bytes2 = strReplaceAll.getBytes(f57111b0);
                                dVar = new d(bytes2, 1, bytes2.length);
                                map5.put(str3, dVar);
                                break;
                            case 2:
                            case 7:
                                i13 = i26;
                                i12 = i27;
                                mapArr[i12].put(str3, d.a(strReplaceAll));
                                i26 = i13;
                                break;
                            case 3:
                                i13 = i26;
                                i12 = i27;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                for (i14 = i13; i14 < strArrSplit.length; i14++) {
                                    iArr2[i14] = Integer.parseInt(strArrSplit[i14]);
                                }
                                mapArr[i12].put(str3, d.f(iArr2, this.f57130g));
                                i26 = i13;
                                break;
                            case 4:
                                i13 = i26;
                                i12 = i27;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                for (i15 = i13; i15 < strArrSplit2.length; i15++) {
                                    jArr[i15] = Long.parseLong(strArrSplit2[i15]);
                                }
                                mapArr[i12].put(str3, d.c(jArr, this.f57130g));
                                i26 = i13;
                                break;
                            case 5:
                                i13 = i26;
                                i12 = i27;
                                i16 = -1;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                i17 = i13;
                                while (i17 < strArrSplit3.length) {
                                    String[] strArrSplit9 = strArrSplit3[i17].split("/", i16);
                                    fVarArr[i17] = new f((long) Double.parseDouble(strArrSplit9[i13]), (long) Double.parseDouble(strArrSplit9[1]));
                                    i17++;
                                    i16 = -1;
                                }
                                mapArr[i12].put(str3, d.d(fVarArr, this.f57130g));
                                i26 = i13;
                                break;
                            case 9:
                                i13 = i26;
                                i12 = i27;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                for (i18 = i13; i18 < strArrSplit4.length; i18++) {
                                    iArr3[i18] = Integer.parseInt(strArrSplit4[i18]);
                                }
                                HashMap map6 = mapArr[i12];
                                ByteOrder byteOrder4 = this.f57130g;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder4);
                                for (i19 = i13; i19 < length; i19++) {
                                    byteBufferWrap.putInt(iArr3[i19]);
                                }
                                map6.put(str3, new d(byteBufferWrap.array(), 9, length));
                                i26 = i13;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i21 = i26;
                                while (i21 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i21].split("/", i30);
                                    int i32 = i21;
                                    fVarArr2[i32] = new f((long) Double.parseDouble(strArrSplit10[i26]), (long) Double.parseDouble(strArrSplit10[1]));
                                    i21 = i32 + 1;
                                    i26 = i26;
                                    i27 = i27;
                                    i30 = -1;
                                }
                                i13 = i26;
                                i12 = i27;
                                HashMap map7 = mapArr[i12];
                                ByteOrder byteOrder5 = this.f57130g;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder5);
                                for (i22 = i13; i22 < length2; i22++) {
                                    f fVar2 = fVarArr2[i22];
                                    byteBufferWrap2.putInt((int) fVar2.f57108a);
                                    byteBufferWrap2.putInt((int) fVar2.f57109b);
                                }
                                map7.put(str3, new d(byteBufferWrap2.array(), 10, length2));
                                i26 = i13;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                for (i23 = i26; i23 < strArrSplit6.length; i23++) {
                                    dArr[i23] = Double.parseDouble(strArrSplit6[i23]);
                                }
                                HashMap map8 = mapArr[i27];
                                ByteOrder byteOrder6 = this.f57130g;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder6);
                                for (i24 = i26; i24 < length3; i24++) {
                                    byteBufferWrap3.putDouble(dArr[i24]);
                                }
                                map8.put(str3, new d(byteBufferWrap3.array(), 12, length3));
                                break;
                        }
                    } else if (i29 == 1 || i29 == 7 || i29 == i25) {
                        i28 = i29;
                        iArr = S;
                        switch (i28) {
                            case 1:
                                i11 = i26;
                                i12 = i27;
                                HashMap map9 = mapArr[i12];
                                if (strReplaceAll.length() == 1) {
                                    i26 = i11;
                                    if (strReplaceAll.charAt(i26) < '0') {
                                    }
                                    map9.put(str3, dVar);
                                } else {
                                    i26 = i11;
                                }
                                byte[] bytes3 = strReplaceAll.getBytes(f57111b0);
                                dVar = new d(bytes3, 1, bytes3.length);
                                map9.put(str3, dVar);
                                break;
                            case 2:
                            case 7:
                                i13 = i26;
                                i12 = i27;
                                mapArr[i12].put(str3, d.a(strReplaceAll));
                                i26 = i13;
                                break;
                            case 3:
                                i13 = i26;
                                i12 = i27;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i14 < strArrSplit.length) {
                                    iArr2[i14] = Integer.parseInt(strArrSplit[i14]);
                                }
                                mapArr[i12].put(str3, d.f(iArr2, this.f57130g));
                                i26 = i13;
                                break;
                            case 4:
                                i13 = i26;
                                i12 = i27;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i15 < strArrSplit2.length) {
                                    jArr[i15] = Long.parseLong(strArrSplit2[i15]);
                                }
                                mapArr[i12].put(str3, d.c(jArr, this.f57130g));
                                i26 = i13;
                                break;
                            case 5:
                                i13 = i26;
                                i12 = i27;
                                i16 = -1;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                i17 = i13;
                                while (i17 < strArrSplit3.length) {
                                    String[] strArrSplit11 = strArrSplit3[i17].split("/", i16);
                                    fVarArr[i17] = new f((long) Double.parseDouble(strArrSplit11[i13]), (long) Double.parseDouble(strArrSplit11[1]));
                                    i17++;
                                    i16 = -1;
                                }
                                mapArr[i12].put(str3, d.d(fVarArr, this.f57130g));
                                i26 = i13;
                                break;
                            case 9:
                                i13 = i26;
                                i12 = i27;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i18 < strArrSplit4.length) {
                                    iArr3[i18] = Integer.parseInt(strArrSplit4[i18]);
                                }
                                HashMap map10 = mapArr[i12];
                                ByteOrder byteOrder7 = this.f57130g;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder7);
                                while (i19 < length) {
                                    byteBufferWrap.putInt(iArr3[i19]);
                                }
                                map10.put(str3, new d(byteBufferWrap.array(), 9, length));
                                i26 = i13;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i21 = i26;
                                while (i21 < strArrSplit5.length) {
                                    String[] strArrSplit12 = strArrSplit5[i21].split("/", i30);
                                    int i33 = i21;
                                    fVarArr2[i33] = new f((long) Double.parseDouble(strArrSplit12[i26]), (long) Double.parseDouble(strArrSplit12[1]));
                                    i21 = i33 + 1;
                                    i26 = i26;
                                    i27 = i27;
                                    i30 = -1;
                                }
                                i13 = i26;
                                i12 = i27;
                                HashMap map11 = mapArr[i12];
                                ByteOrder byteOrder8 = this.f57130g;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder8);
                                while (i22 < length2) {
                                    f fVar3 = fVarArr2[i22];
                                    byteBufferWrap2.putInt((int) fVar3.f57108a);
                                    byteBufferWrap2.putInt((int) fVar3.f57109b);
                                }
                                map11.put(str3, new d(byteBufferWrap2.array(), 10, length2));
                                i26 = i13;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i23 < strArrSplit6.length) {
                                    dArr[i23] = Double.parseDouble(strArrSplit6[i23]);
                                }
                                HashMap map12 = mapArr[i27];
                                ByteOrder byteOrder9 = this.f57130g;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder9);
                                while (i24 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i24]);
                                }
                                map12.put(str3, new d(byteBufferWrap3.array(), 12, length3));
                                break;
                        }
                    } else if (f57117t) {
                        String[] strArr = R;
                        String str4 = strArr[i29];
                        if (i28 != -1) {
                            String str5 = strArr[i28];
                        }
                        String str6 = strArr[((Integer) pairO.first).intValue()];
                        if (((Integer) pairO.second).intValue() != -1) {
                            String str7 = strArr[((Integer) pairO.second).intValue()];
                        }
                    }
                } else {
                    mapArr[i27].remove(str3);
                }
                i12 = i27;
            } else {
                i12 = i27;
            }
            i27 = i12 + 1;
            i25 = 2;
        }
    }

    public final void D(b bVar) throws IOException {
        d dVar;
        HashMap map = this.f57128e[4];
        d dVar2 = (d) map.get("Compression");
        if (dVar2 == null) {
            this.f57136n = 6;
            p(bVar, map);
            return;
        }
        int iH = dVar2.h(this.f57130g);
        this.f57136n = iH;
        if (iH != 1) {
            if (iH == 6) {
                p(bVar, map);
                return;
            } else if (iH != 7) {
                return;
            }
        }
        d dVar3 = (d) map.get("BitsPerSample");
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.j(this.f57130g);
            int[] iArr2 = f57120w;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f57127d != 3 || (dVar = (d) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iH2 = dVar.h(this.f57130g);
                if ((iH2 != 1 || !Arrays.equals(iArr, f57121x)) && (iH2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            d dVar4 = (d) map.get("StripOffsets");
            d dVar5 = (d) map.get("StripByteCounts");
            if (dVar4 == null || dVar5 == null) {
                return;
            }
            long[] jArrJ = o00.a.j(dVar4.j(this.f57130g));
            long[] jArrJ2 = o00.a.j(dVar5.j(this.f57130g));
            if (jArrJ == null || jArrJ.length == 0 || jArrJ2 == null || jArrJ2.length == 0 || jArrJ.length != jArrJ2.length) {
                return;
            }
            long j11 = 0;
            for (long j12 : jArrJ2) {
                j11 += j12;
            }
            int i11 = (int) j11;
            byte[] bArr = new byte[i11];
            this.f57133j = true;
            this.f57132i = true;
            this.f57131h = true;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < jArrJ.length; i14++) {
                int i15 = (int) jArrJ[i14];
                int i16 = (int) jArrJ2[i14];
                if (i14 < jArrJ.length - 1 && i15 + i16 != jArrJ[i14 + 1]) {
                    this.f57133j = false;
                }
                int i17 = i15 - i12;
                if (i17 < 0) {
                    return;
                }
                try {
                    bVar.a(i17);
                    int i18 = i12 + i17;
                    byte[] bArr2 = new byte[i16];
                    bVar.readFully(bArr2);
                    i12 = i18 + i16;
                    System.arraycopy(bArr2, 0, bArr, i13, i16);
                    i13 += i16;
                } catch (EOFException unused) {
                    return;
                }
            }
            this.m = bArr;
            if (this.f57133j) {
                this.f57134k = (int) jArrJ[0];
                this.f57135l = i11;
            }
        }
    }

    public final void E(int i11, int i12) {
        HashMap[] mapArr = this.f57128e;
        if (mapArr[i11].isEmpty() || mapArr[i12].isEmpty()) {
            return;
        }
        d dVar = (d) mapArr[i11].get("ImageLength");
        d dVar2 = (d) mapArr[i11].get("ImageWidth");
        d dVar3 = (d) mapArr[i12].get("ImageLength");
        d dVar4 = (d) mapArr[i12].get("ImageWidth");
        if (dVar == null || dVar2 == null || dVar3 == null || dVar4 == null) {
            return;
        }
        int iH = dVar.h(this.f57130g);
        int iH2 = dVar2.h(this.f57130g);
        int iH3 = dVar3.h(this.f57130g);
        int iH4 = dVar4.h(this.f57130g);
        if (iH >= iH3 || iH2 >= iH4) {
            return;
        }
        HashMap map = mapArr[i11];
        mapArr[i11] = mapArr[i12];
        mapArr[i12] = map;
    }

    public final void F(g gVar, int i11) throws IOException {
        d dVarE;
        d dVarE2;
        HashMap[] mapArr = this.f57128e;
        d dVar = (d) mapArr[i11].get("DefaultCropSize");
        d dVar2 = (d) mapArr[i11].get("SensorTopBorder");
        d dVar3 = (d) mapArr[i11].get("SensorLeftBorder");
        d dVar4 = (d) mapArr[i11].get("SensorBottomBorder");
        d dVar5 = (d) mapArr[i11].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f57100a == 5) {
                f[] fVarArr = (f[]) dVar.j(this.f57130g);
                if (fVarArr == null || fVarArr.length != 2) {
                    Arrays.toString(fVarArr);
                    return;
                }
                dVarE = d.d(new f[]{fVarArr[0]}, this.f57130g);
                dVarE2 = d.d(new f[]{fVarArr[1]}, this.f57130g);
            } else {
                int[] iArr = (int[]) dVar.j(this.f57130g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    dVarE = d.e(iArr[0], this.f57130g);
                    dVarE2 = d.e(iArr[1], this.f57130g);
                }
            }
            mapArr[i11].put("ImageWidth", dVarE);
            mapArr[i11].put("ImageLength", dVarE2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int iH = dVar2.h(this.f57130g);
            int iH2 = dVar4.h(this.f57130g);
            int iH3 = dVar5.h(this.f57130g);
            int iH4 = dVar3.h(this.f57130g);
            if (iH2 <= iH || iH3 <= iH4) {
                return;
            }
            d dVarE3 = d.e(iH2 - iH, this.f57130g);
            d dVarE4 = d.e(iH3 - iH4, this.f57130g);
            mapArr[i11].put("ImageLength", dVarE3);
            mapArr[i11].put("ImageWidth", dVarE4);
            return;
        }
        d dVar6 = (d) mapArr[i11].get("ImageLength");
        d dVar7 = (d) mapArr[i11].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = (d) mapArr[i11].get("JPEGInterchangeFormat");
            d dVar9 = (d) mapArr[i11].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int iH5 = dVar8.h(this.f57130g);
            int iH6 = dVar8.h(this.f57130g);
            gVar.b(iH5);
            byte[] bArr = new byte[iH6];
            gVar.readFully(bArr);
            f(new b(bArr), iH5, i11);
        }
    }

    public final void G() {
        E(0, 5);
        E(0, 4);
        E(5, 4);
        HashMap[] mapArr = this.f57128e;
        d dVar = (d) mapArr[1].get("PixelXDimension");
        d dVar2 = (d) mapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            mapArr[0].put("ImageWidth", dVar);
            mapArr[0].put("ImageLength", dVar2);
        }
        if (mapArr[4].isEmpty() && q(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        q(mapArr[4]);
        y(0, "ThumbnailOrientation", "Orientation");
        y(0, "ThumbnailImageLength", "ImageLength");
        y(0, "ThumbnailImageWidth", "ImageWidth");
        y(5, "ThumbnailOrientation", "Orientation");
        y(5, "ThumbnailImageLength", "ImageLength");
        y(5, "ThumbnailImageWidth", "ImageWidth");
        y(4, "Orientation", "ThumbnailOrientation");
        y(4, "ImageLength", "ThumbnailImageLength");
        y(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void H(c cVar) throws IOException {
        HashMap[] mapArr;
        int[] iArr;
        e[][] eVarArr = V;
        int[] iArr2 = new int[eVarArr.length];
        int[] iArr3 = new int[eVarArr.length];
        e[] eVarArr2 = W;
        for (e eVar : eVarArr2) {
            x(eVar.f57105b);
        }
        if (this.f57131h) {
            if (this.f57132i) {
                x("StripOffsets");
                x("StripByteCounts");
            } else {
                x("JPEGInterchangeFormat");
                x("JPEGInterchangeFormatLength");
            }
        }
        int i11 = 0;
        while (true) {
            int length = eVarArr.length;
            mapArr = this.f57128e;
            if (i11 >= length) {
                break;
            }
            Object[] array = mapArr[i11].entrySet().toArray();
            int length2 = array.length;
            int i12 = 0;
            while (i12 < length2) {
                Map.Entry entry = (Map.Entry) array[i12];
                if (entry.getValue() == null) {
                    mapArr[i11].remove(entry.getKey());
                }
                i12++;
                iArr2 = iArr2;
            }
            i11++;
        }
        int[] iArr4 = iArr2;
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(eVarArr2[1].f57105b, d.b(0L, this.f57130g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(eVarArr2[2].f57105b, d.b(0L, this.f57130g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(eVarArr2[3].f57105b, d.b(0L, this.f57130g));
        }
        if (this.f57131h) {
            if (this.f57132i) {
                mapArr[4].put("StripOffsets", d.e(0, this.f57130g));
                mapArr[4].put("StripByteCounts", d.e(this.f57135l, this.f57130g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.b(0L, this.f57130g));
                mapArr[4].put("JPEGInterchangeFormatLength", d.b(this.f57135l, this.f57130g));
            }
        }
        int i13 = 0;
        while (true) {
            int length3 = eVarArr.length;
            iArr = S;
            if (i13 >= length3) {
                break;
            }
            Iterator it = mapArr[i13].entrySet().iterator();
            int i14 = 0;
            while (it.hasNext()) {
                d dVar = (d) ((Map.Entry) it.next()).getValue();
                dVar.getClass();
                int i15 = iArr[dVar.f57100a] * dVar.f57101b;
                if (i15 > 4) {
                    i14 += i15;
                }
            }
            iArr3[i13] = iArr3[i13] + i14;
            i13++;
        }
        int size = 8;
        for (int i16 = 0; i16 < eVarArr.length; i16++) {
            if (!mapArr[i16].isEmpty()) {
                iArr4[i16] = size;
                size = (mapArr[i16].size() * 12) + 6 + iArr3[i16] + size;
            }
        }
        if (this.f57131h) {
            if (this.f57132i) {
                mapArr[4].put("StripOffsets", d.e(size, this.f57130g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.b(size, this.f57130g));
            }
            this.f57134k = size;
            size += this.f57135l;
        }
        if (this.f57127d == 4) {
            size += 8;
        }
        if (f57117t) {
            for (int i17 = 0; i17 < eVarArr.length; i17++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i17), Integer.valueOf(iArr4[i17]), Integer.valueOf(mapArr[i17].size()), Integer.valueOf(iArr3[i17]), Integer.valueOf(size));
            }
        }
        if (!mapArr[r3].isEmpty()) {
            mapArr[0].put(eVarArr2[r3].f57105b, d.b(iArr4[r3], this.f57130g));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[0].put(eVarArr2[r6].f57105b, d.b(iArr4[2], this.f57130g));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[r3].put(eVarArr2[r6].f57105b, d.b(iArr4[3], this.f57130g));
        }
        int i18 = this.f57127d;
        if (i18 == 4) {
            if (size > 65535) {
                throw new IllegalStateException(p0.h(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            cVar.e(size);
            cVar.write(f57112c0);
        } else if (i18 == 13) {
            cVar.b(size);
            cVar.write(F);
        } else if (i18 == 14) {
            cVar.write(K);
            cVar.b(size);
        }
        cVar.c(this.f57130g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f57099b = this.f57130g;
        cVar.e(42);
        cVar.d(8L);
        for (int i19 = 0; i19 < eVarArr.length; i19++) {
            if (!mapArr[i19].isEmpty()) {
                cVar.e(mapArr[i19].size());
                int size2 = (mapArr[i19].size() * 12) + iArr4[i19] + 2 + 4;
                for (Map.Entry entry2 : mapArr[i19].entrySet()) {
                    int i21 = ((e) Y[i19].get(entry2.getKey())).f57104a;
                    d dVar2 = (d) entry2.getValue();
                    dVar2.getClass();
                    int i22 = dVar2.f57101b;
                    int i23 = dVar2.f57100a;
                    int i24 = iArr[i23] * i22;
                    cVar.e(i21);
                    cVar.e(i23);
                    cVar.b(i22);
                    if (i24 > 4) {
                        cVar.d(size2);
                        size2 += i24;
                    } else {
                        cVar.write(dVar2.f57103d);
                        if (i24 < 4) {
                            while (i24 < 4) {
                                cVar.a(0);
                                i24++;
                            }
                        }
                    }
                }
                if (i19 != 0 || mapArr[4].isEmpty()) {
                    cVar.d(0L);
                } else {
                    cVar.d(iArr4[4]);
                }
                Iterator it2 = mapArr[i19].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it2.next()).getValue()).f57103d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f57131h) {
            cVar.write(m());
        }
        if (this.f57127d == 14 && size % 2 == 1) {
            cVar.a(0);
        }
        cVar.f57099b = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f57128e;
        if (strB != null && b("DateTime") == null) {
            mapArr[0].put("DateTime", d.a(strB));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", d.b(0L, this.f57130g));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", d.b(0L, this.f57130g));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", d.b(0L, this.f57130g));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", d.b(0L, this.f57130g));
        }
    }

    public final int c() {
        d dVarD = d("Orientation");
        if (dVarD == null) {
            return 1;
        }
        try {
            return dVarD.h(this.f57130g);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final d d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i11 = 0; i11 < V.length; i11++) {
            d dVar = (d) this.f57128e[i11].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void e(g gVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i11;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                j.a(mediaMetadataRetriever, new a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f57128e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", d.e(Integer.parseInt(strExtractMetadata), this.f57130g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", d.e(Integer.parseInt(strExtractMetadata2), this.f57130g));
                }
                if (strExtractMetadata3 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata3);
                    if (i12 == 90) {
                        i11 = 6;
                    } else if (i12 != 180) {
                        i11 = i12 != 270 ? 1 : 8;
                    } else {
                        i11 = 3;
                    }
                    mapArr[0].put("Orientation", d.e(i11, this.f57130g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata4);
                    int i14 = Integer.parseInt(strExtractMetadata5);
                    if (i14 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.b(i13);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i15 = i13 + 6;
                    int i16 = i14 - 6;
                    if (!Arrays.equals(bArr, f57112c0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i16];
                    gVar.readFully(bArr2);
                    this.f57137o = i15;
                    v(bArr2, 0);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006a A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed A[LOOP:2: B:65:0x00e3->B:70:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x0136 A[LOOP:0: B:10:0x0023->B:78:0x0136, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x005f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0062. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void f(y5.b r23, int r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.h.f(y5.b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x0125  */
    /* JADX WARN: Code duplicated, block: B:106:0x012b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0133 A[LOOP:2: B:104:0x0126->B:109:0x0133, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0139 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:114:0x013c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0142  */
    /* JADX WARN: Code duplicated, block: B:120:0x014a A[LOOP:3: B:115:0x013d->B:120:0x014a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x0153  */
    /* JADX WARN: Code duplicated, block: B:127:0x015d A[LOOP:4: B:122:0x014e->B:127:0x015d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x0163 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:148:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0148 A[EDGE_INSN: B:160:0x0148->B:119:0x0148 BREAK  A[LOOP:3: B:115:0x013d->B:120:0x014a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0148 A[EDGE_INSN: B:162:0x0148->B:119:0x0148 BREAK  A[LOOP:3: B:115:0x013d->B:120:0x014a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:86:0x0105  */
    public final int g(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        boolean z11;
        b bVar5;
        b bVar6;
        boolean z12;
        int i11;
        byte[] bArr;
        boolean z13;
        int i12;
        byte[] bArr2;
        int i13;
        byte[] bArr3;
        boolean z14;
        b bVar7;
        short s3;
        long j11;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i14 = 0;
        while (true) {
            byte[] bArr5 = f57122y;
            if (i14 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i14] != bArr5[i14]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i15 = 0; i15 < bytes.length; i15++) {
                    if (bArr4[i15] != bytes[i15]) {
                        try {
                            bVar2 = new b(bArr4);
                            try {
                                long j12 = bVar2.readInt();
                                byte[] bArr6 = new byte[4];
                                bVar2.readFully(bArr6);
                                if (Arrays.equals(bArr6, f57123z)) {
                                    if (j12 == 1) {
                                        j12 = bVar2.readLong();
                                        j11 = 16;
                                        if (j12 < 16) {
                                        }
                                    } else {
                                        j11 = 8;
                                    }
                                    long j13 = 5000;
                                    if (j12 > j13) {
                                        j12 = j13;
                                    }
                                    long j14 = j12 - j11;
                                    if (j14 >= 8) {
                                        byte[] bArr7 = new byte[4];
                                        boolean z15 = false;
                                        boolean z16 = false;
                                        for (long j15 = 0; j15 < j14 / 4; j15++) {
                                            try {
                                                bVar2.readFully(bArr7);
                                                if (j15 != 1) {
                                                    if (Arrays.equals(bArr7, A)) {
                                                        z15 = true;
                                                    } else if (Arrays.equals(bArr7, B)) {
                                                        z16 = true;
                                                    }
                                                    if (z15 && z16) {
                                                        bVar2.close();
                                                        return 12;
                                                    }
                                                }
                                            } catch (EOFException unused) {
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused2) {
                                if (bVar2 != null) {
                                }
                                bVar4 = new b(bArr4);
                                ByteOrder byteOrderU = u(bVar4);
                                this.f57130g = byteOrderU;
                                bVar4.f57095c = byteOrderU;
                                s3 = bVar4.readShort();
                                if (s3 != 20306) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                bVar4.close();
                                if (z11) {
                                    return 7;
                                }
                                try {
                                    bVar7 = new b(bArr4);
                                    try {
                                        ByteOrder byteOrderU2 = u(bVar7);
                                        this.f57130g = byteOrderU2;
                                        bVar7.f57095c = byteOrderU2;
                                        if (bVar7.readShort() == 85) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        bVar7.close();
                                    } catch (Exception unused3) {
                                        bVar6 = bVar7;
                                        if (bVar6 != null) {
                                            bVar6.close();
                                        }
                                        z12 = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bVar5 = bVar7;
                                        if (bVar5 != null) {
                                            bVar5.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused4) {
                                    bVar6 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    bVar5 = null;
                                }
                                if (z12) {
                                    return 10;
                                }
                                i11 = 0;
                                while (true) {
                                    bArr = E;
                                    if (i11 < bArr.length) {
                                        z13 = true;
                                        break;
                                    }
                                    if (bArr4[i11] != bArr[i11]) {
                                        z13 = false;
                                        break;
                                    }
                                    i11++;
                                }
                                if (z13) {
                                    return 13;
                                }
                                i12 = 0;
                                while (true) {
                                    bArr2 = I;
                                    if (i12 < bArr2.length) {
                                        i13 = 0;
                                        while (true) {
                                            bArr3 = J;
                                            if (i13 < bArr3.length) {
                                                z14 = true;
                                                break;
                                            }
                                            if (bArr4[bArr2.length + i13 + 4] != bArr3[i13]) {
                                                break;
                                            }
                                            i13++;
                                        }
                                        if (z14) {
                                            return 14;
                                        }
                                        return 0;
                                    }
                                    if (bArr4[i12] != bArr2[i12]) {
                                        break;
                                    }
                                    i12++;
                                }
                                z14 = false;
                                if (z14) {
                                    return 14;
                                }
                                return 0;
                            } catch (Throwable th4) {
                                th = th4;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused5) {
                            bVar2 = null;
                        } catch (Throwable th5) {
                            th = th5;
                            bVar = null;
                        }
                        bVar2.close();
                        try {
                            bVar4 = new b(bArr4);
                            try {
                                ByteOrder byteOrderU3 = u(bVar4);
                                this.f57130g = byteOrderU3;
                                bVar4.f57095c = byteOrderU3;
                                s3 = bVar4.readShort();
                                if (s3 != 20306 || s3 == 21330) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                bVar4.close();
                            } catch (Exception unused6) {
                                if (bVar4 != null) {
                                    bVar4.close();
                                }
                                z11 = false;
                            } catch (Throwable th6) {
                                th = th6;
                                bVar3 = bVar4;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused7) {
                            bVar4 = null;
                        } catch (Throwable th7) {
                            th = th7;
                            bVar3 = null;
                        }
                        if (z11) {
                            return 7;
                        }
                        bVar7 = new b(bArr4);
                        ByteOrder byteOrderU4 = u(bVar7);
                        this.f57130g = byteOrderU4;
                        bVar7.f57095c = byteOrderU4;
                        if (bVar7.readShort() == 85) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        bVar7.close();
                        if (z12) {
                            return 10;
                        }
                        i11 = 0;
                        while (true) {
                            bArr = E;
                            if (i11 < bArr.length) {
                                z13 = true;
                                break;
                            }
                            if (bArr4[i11] != bArr[i11]) {
                                z13 = false;
                                break;
                            }
                            i11++;
                        }
                        if (z13) {
                            return 13;
                        }
                        i12 = 0;
                        while (true) {
                            bArr2 = I;
                            if (i12 < bArr2.length) {
                                i13 = 0;
                                while (true) {
                                    bArr3 = J;
                                    if (i13 < bArr3.length) {
                                        z14 = true;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i13 + 4] != bArr3[i13]) {
                                        break;
                                        break;
                                    }
                                    i13++;
                                }
                                if (z14) {
                                    return 14;
                                }
                                return 0;
                            }
                            if (bArr4[i12] != bArr2[i12]) {
                                break;
                                break;
                            }
                            i12++;
                        }
                        z14 = false;
                        if (z14) {
                            return 14;
                        }
                        return 0;
                    }
                }
                return 9;
            }
            i14++;
        }
    }

    public final void h(g gVar) throws IOException {
        int i11;
        int i12;
        k(gVar);
        HashMap[] mapArr = this.f57128e;
        d dVar = (d) mapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f57103d);
            gVar2.f57095c = this.f57130g;
            byte[] bArr = C;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.b(0L);
            byte[] bArr3 = D;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.b(12L);
            }
            w(gVar2, 6);
            d dVar2 = (d) mapArr[7].get("PreviewImageStart");
            d dVar3 = (d) mapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", dVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) mapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.j(this.f57130g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i13 = iArr[2];
                int i14 = iArr[0];
                if (i13 <= i14 || (i11 = iArr[3]) <= (i12 = iArr[1])) {
                    return;
                }
                int i15 = (i13 - i14) + 1;
                int i16 = (i11 - i12) + 1;
                if (i15 < i16) {
                    int i17 = i15 + i16;
                    i16 = i17 - i16;
                    i15 = i17 - i16;
                }
                d dVarE = d.e(i15, this.f57130g);
                d dVarE2 = d.e(i16, this.f57130g);
                mapArr[0].put("ImageWidth", dVarE);
                mapArr[0].put("ImageLength", dVarE2);
            }
        }
    }

    public final void i(b bVar) throws IOException {
        if (f57117t) {
            Objects.toString(bVar);
        }
        bVar.f57095c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = E;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i11 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i12 = length + 8;
                if (i12 == 16 && !Arrays.equals(bArr2, G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, H)) {
                    return;
                }
                if (Arrays.equals(bArr2, F)) {
                    byte[] bArr3 = new byte[i11];
                    bVar.readFully(bArr3);
                    int i13 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i13) {
                        this.f57137o = i12;
                        v(bArr3, 0);
                        G();
                        D(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i13 + ", calculated CRC value: " + crc32.getValue());
                }
                int i14 = i11 + 4;
                bVar.a(i14);
                length = i12 + i14;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void j(b bVar) throws IOException {
        if (f57117t) {
            Objects.toString(bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i11 = ByteBuffer.wrap(bArr).getInt();
        int i12 = ByteBuffer.wrap(bArr2).getInt();
        int i13 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i12];
        bVar.a(i11 - bVar.f57094b);
        bVar.readFully(bArr4);
        f(new b(bArr4), i11, 5);
        bVar.a(i13 - bVar.f57094b);
        bVar.f57095c = ByteOrder.BIG_ENDIAN;
        int i14 = bVar.readInt();
        for (int i15 = 0; i15 < i14; i15++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == U.f57104a) {
                short s3 = bVar.readShort();
                short s11 = bVar.readShort();
                d dVarE = d.e(s3, this.f57130g);
                d dVarE2 = d.e(s11, this.f57130g);
                HashMap[] mapArr = this.f57128e;
                mapArr[0].put("ImageLength", dVarE);
                mapArr[0].put("ImageWidth", dVarE2);
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void k(g gVar) throws IOException {
        s(gVar);
        w(gVar, 0);
        F(gVar, 0);
        F(gVar, 5);
        F(gVar, 4);
        G();
        if (this.f57127d == 8) {
            HashMap[] mapArr = this.f57128e;
            d dVar = (d) mapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.f57103d);
                gVar2.f57095c = this.f57130g;
                gVar2.a(6);
                w(gVar2, 9);
                d dVar2 = (d) mapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    mapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final void l(g gVar) throws IOException {
        if (f57117t) {
            Objects.toString(gVar);
        }
        k(gVar);
        HashMap[] mapArr = this.f57128e;
        d dVar = (d) mapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            f(new b(dVar.f57103d), (int) dVar.f57102c, 5);
        }
        d dVar2 = (d) mapArr[0].get("ISO");
        d dVar3 = (d) mapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", dVar2);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
    public final byte[] m() throws Throwable {
        Throwable th2;
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        Throwable th3;
        InputStream inputStream = null;
        if (this.f57131h) {
            byte[] bArr = this.m;
            if (bArr != null) {
                return bArr;
            }
            try {
                fileInputStream = this.f57126c;
                if (fileInputStream != null) {
                    try {
                        if (!fileInputStream.markSupported()) {
                            o00.a.i(fileInputStream);
                            return null;
                        }
                        fileInputStream.reset();
                        fileDescriptor = null;
                        try {
                            b bVar = new b(fileInputStream);
                            bVar.a(this.f57134k + this.f57137o);
                            byte[] bArr2 = new byte[this.f57135l];
                            bVar.readFully(bArr2);
                            this.m = bArr2;
                            o00.a.i(fileInputStream);
                            if (fileDescriptor != null) {
                                try {
                                    i.a(fileDescriptor);
                                } catch (Exception unused) {
                                }
                            }
                            return bArr2;
                        } catch (Exception unused2) {
                        } catch (Throwable th4) {
                            th3 = th4;
                            inputStream = fileInputStream;
                            th2 = th3;
                            o00.a.i(inputStream);
                            if (fileDescriptor == null) {
                                throw th2;
                            }
                            try {
                                i.a(fileDescriptor);
                                throw th2;
                            } catch (Exception unused3) {
                                throw th2;
                            }
                        }
                    } catch (Exception unused4) {
                        fileDescriptor = null;
                    } catch (Throwable th5) {
                        inputStream = fileInputStream;
                        th2 = th5;
                        fileDescriptor = null;
                        o00.a.i(inputStream);
                        if (fileDescriptor == null) {
                            throw th2;
                        }
                        i.a(fileDescriptor);
                        throw th2;
                    }
                    o00.a.i(fileInputStream);
                    if (fileDescriptor != null) {
                        try {
                            i.a(fileDescriptor);
                        } catch (Exception unused5) {
                        }
                    }
                } else {
                    if (this.f57124a != null) {
                        fileInputStream = new FileInputStream(this.f57124a);
                        fileDescriptor = null;
                        b bVar2 = new b(fileInputStream);
                        bVar2.a(this.f57134k + this.f57137o);
                        byte[] bArr3 = new byte[this.f57135l];
                        bVar2.readFully(bArr3);
                        this.m = bArr3;
                        o00.a.i(fileInputStream);
                        if (fileDescriptor != null) {
                            i.a(fileDescriptor);
                        }
                        return bArr3;
                    }
                    FileDescriptor fileDescriptorB = i.b(this.f57125b);
                    try {
                        i.c(fileDescriptorB, 0L, OsConstants.SEEK_SET);
                        fileDescriptor = fileDescriptorB;
                        fileInputStream = new FileInputStream(fileDescriptorB);
                        b bVar3 = new b(fileInputStream);
                        bVar3.a(this.f57134k + this.f57137o);
                        byte[] bArr4 = new byte[this.f57135l];
                        bVar3.readFully(bArr4);
                        this.m = bArr4;
                        o00.a.i(fileInputStream);
                        if (fileDescriptor != null) {
                            i.a(fileDescriptor);
                        }
                        return bArr4;
                    } catch (Exception unused6) {
                        fileDescriptor = fileDescriptorB;
                        fileInputStream = null;
                    } catch (Throwable th6) {
                        th3 = th6;
                        fileDescriptor = fileDescriptorB;
                        th2 = th3;
                        o00.a.i(inputStream);
                        if (fileDescriptor == null) {
                            throw th2;
                        }
                        i.a(fileDescriptor);
                        throw th2;
                    }
                }
            } catch (Exception unused7) {
                fileInputStream = null;
                fileDescriptor = null;
            } catch (Throwable th7) {
                th2 = th7;
                fileDescriptor = null;
            }
        }
        return null;
    }

    public final void n(b bVar) throws IOException {
        if (f57117t) {
            Objects.toString(bVar);
        }
        bVar.f57095c = ByteOrder.LITTLE_ENDIAN;
        bVar.a(I.length);
        int i11 = bVar.readInt() + 8;
        byte[] bArr = J;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i12 = bVar.readInt();
                int i13 = length + 8;
                if (Arrays.equals(K, bArr2)) {
                    byte[] bArr3 = new byte[i12];
                    bVar.readFully(bArr3);
                    this.f57137o = i13;
                    v(bArr3, 0);
                    D(new b(bArr3));
                    return;
                }
                if (i12 % 2 == 1) {
                    i12++;
                }
                length = i13 + i12;
                if (length == i11) {
                    return;
                }
                if (length > i11) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i12);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void p(b bVar, HashMap map) throws IOException {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iH = dVar.h(this.f57130g);
        int iH2 = dVar2.h(this.f57130g);
        if (this.f57127d == 7) {
            iH += this.f57138p;
        }
        if (iH <= 0 || iH2 <= 0) {
            return;
        }
        this.f57131h = true;
        if (this.f57124a == null && this.f57126c == null && this.f57125b == null) {
            byte[] bArr = new byte[iH2];
            bVar.a(iH);
            bVar.readFully(bArr);
            this.m = bArr;
        }
        this.f57134k = iH;
        this.f57135l = iH2;
    }

    public final boolean q(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.h(this.f57130g) <= 512 && dVar2.h(this.f57130g) <= 512;
    }

    public final void r(InputStream inputStream) {
        boolean z11 = f57117t;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i11 = 0; i11 < V.length; i11++) {
            try {
                this.f57128e[i11] = new HashMap();
            } catch (IOException | UnsupportedOperationException unused) {
                a();
                if (z11) {
                    t();
                    return;
                }
                return;
            } catch (Throwable th2) {
                a();
                if (z11) {
                    t();
                }
                throw th2;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iG = g(bufferedInputStream);
        this.f57127d = iG;
        if (iG == 4 || iG == 9 || iG == 13 || iG == 14) {
            b bVar = new b(bufferedInputStream);
            int i12 = this.f57127d;
            if (i12 == 4) {
                f(bVar, 0, 0);
            } else if (i12 == 13) {
                i(bVar);
            } else if (i12 == 9) {
                j(bVar);
            } else if (i12 == 14) {
                n(bVar);
            }
        } else {
            g gVar = new g(bufferedInputStream);
            int i13 = this.f57127d;
            if (i13 == 12) {
                e(gVar);
            } else if (i13 == 7) {
                h(gVar);
            } else if (i13 == 10) {
                l(gVar);
            } else {
                k(gVar);
            }
            gVar.b(this.f57137o);
            D(gVar);
        }
        a();
        if (z11) {
            t();
        }
    }

    public final void s(g gVar) throws IOException {
        ByteOrder byteOrderU = u(gVar);
        this.f57130g = byteOrderU;
        gVar.f57095c = byteOrderU;
        int unsignedShort = gVar.readUnsignedShort();
        int i11 = this.f57127d;
        if (i11 != 7 && i11 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i12 = gVar.readInt();
        if (i12 < 8) {
            throw new IOException(p.j(i12, "Invalid first Ifd offset: "));
        }
        int i13 = i12 - 8;
        if (i13 > 0) {
            gVar.a(i13);
        }
    }

    public final void t() {
        int i11 = 0;
        while (true) {
            HashMap[] mapArr = this.f57128e;
            if (i11 >= mapArr.length) {
                return;
            }
            mapArr[i11].size();
            for (Map.Entry entry : mapArr[i11].entrySet()) {
                d dVar = (d) entry.getValue();
                dVar.toString();
                dVar.i(this.f57130g);
            }
            i11++;
        }
    }

    public final void v(byte[] bArr, int i11) throws IOException {
        g gVar = new g(bArr);
        s(gVar);
        w(gVar, i11);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    public final void w(g gVar, int i11) throws IOException {
        boolean z11;
        HashMap[] mapArr;
        HashMap[] mapArr2;
        e eVar;
        long j11;
        int i12;
        boolean z12;
        HashMap[] mapArr3;
        e eVar2;
        int unsignedShort;
        long j12;
        int i13;
        Integer numValueOf = Integer.valueOf(gVar.f57094b);
        HashSet hashSet = this.f57129f;
        hashSet.add(numValueOf);
        short s3 = gVar.readShort();
        if (s3 <= 0) {
            return;
        }
        short s11 = 0;
        while (true) {
            z11 = f57117t;
            mapArr = this.f57128e;
            if (s11 >= s3) {
                break;
            }
            int unsignedShort2 = gVar.readUnsignedShort();
            int unsignedShort3 = gVar.readUnsignedShort();
            int i14 = gVar.readInt();
            short s12 = s11;
            long j13 = ((long) gVar.f57094b) + 4;
            e eVar3 = (e) X[i11].get(Integer.valueOf(unsignedShort2));
            if (z11) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i11), Integer.valueOf(unsignedShort2), eVar3 != null ? eVar3.f57105b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i14));
            }
            if (eVar3 != null && unsignedShort3 > 0) {
                int[] iArr = S;
                if (unsignedShort3 < iArr.length) {
                    int i15 = eVar3.f57106c;
                    if (i15 == 7 || unsignedShort3 == 7 || i15 == unsignedShort3 || (i12 = eVar3.f57107d) == unsignedShort3 || (((i15 == 4 || i12 == 4) && unsignedShort3 == 3) || (((i15 == 9 || i12 == 9) && unsignedShort3 == 8) || ((i15 == 12 || i12 == 12) && unsignedShort3 == 11)))) {
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i15;
                        }
                        mapArr2 = mapArr;
                        eVar = eVar3;
                        j11 = ((long) i14) * ((long) iArr[unsignedShort3]);
                        z12 = j11 >= 0 && j11 <= 2147483647L;
                    } else {
                        if (z11 != 0) {
                            String str = R[unsignedShort3];
                        }
                        eVar = eVar3;
                        mapArr2 = mapArr;
                        j11 = 0;
                    }
                } else {
                    eVar = eVar3;
                    mapArr2 = mapArr;
                    j11 = 0;
                }
            } else {
                eVar = eVar3;
                mapArr2 = mapArr;
                j11 = 0;
            }
            if (z12) {
                if (j11 > 4) {
                    int i16 = gVar.readInt();
                    if (this.f57127d == 7) {
                        mapArr3 = mapArr2;
                        eVar2 = eVar;
                        if ("MakerNote".equals(eVar2.f57105b)) {
                            this.f57138p = i16;
                        } else {
                            if (i11 == 6 && "ThumbnailImage".equals(eVar2.f57105b)) {
                                this.f57139q = i16;
                                this.f57140r = i14;
                                d dVarE = d.e(6, this.f57130g);
                                unsignedShort2 = unsignedShort2;
                                d dVarB = d.b(this.f57139q, this.f57130g);
                                d dVarB2 = d.b(this.f57140r, this.f57130g);
                                mapArr3[4].put("Compression", dVarE);
                                mapArr3[4].put("JPEGInterchangeFormat", dVarB);
                                mapArr3[4].put("JPEGInterchangeFormatLength", dVarB2);
                            }
                            gVar.b(i16);
                        }
                    } else {
                        mapArr3 = mapArr2;
                        eVar2 = eVar;
                    }
                    gVar.b(i16);
                } else {
                    mapArr3 = mapArr2;
                    unsignedShort2 = unsignedShort2;
                    eVar2 = eVar;
                    i14 = i14;
                }
                Integer num = (Integer) f57110a0.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j12 = ((long) gVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = gVar.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = gVar.readInt();
                        } else {
                            j12 = -1;
                        }
                        if (z11) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j12), eVar2.f57105b);
                        }
                        if (j12 > 0 && (((i13 = gVar.f57097e) == -1 || j12 < i13) && !hashSet.contains(Integer.valueOf((int) j12)))) {
                            gVar.b(j12);
                            w(gVar, num.intValue());
                        }
                        gVar.b(j13);
                    } else {
                        unsignedShort = gVar.readUnsignedShort();
                    }
                    j12 = unsignedShort;
                    if (z11) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j12), eVar2.f57105b);
                    }
                    if (j12 > 0) {
                        gVar.b(j12);
                        w(gVar, num.intValue());
                    }
                    gVar.b(j13);
                } else {
                    int i17 = gVar.f57094b + this.f57137o;
                    byte[] bArr = new byte[(int) j11];
                    gVar.readFully(bArr);
                    d dVar = new d(i17, unsignedShort3, bArr, i14);
                    HashMap map = mapArr3[i11];
                    String str2 = eVar2.f57105b;
                    map.put(str2, dVar);
                    if ("DNGVersion".equals(str2)) {
                        this.f57127d = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && dVar.i(this.f57130g).contains("PENTAX")) || ("Compression".equals(str2) && dVar.h(this.f57130g) == 65535)) {
                        this.f57127d = 8;
                    }
                    if (gVar.f57094b != j13) {
                        gVar.b(j13);
                    }
                }
            } else {
                gVar.b(j13);
            }
            s11 = (short) (s12 + 1);
            s3 = s3;
        }
        int i18 = gVar.readInt();
        if (z11) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i18));
        }
        long j14 = i18;
        if (j14 <= 0 || hashSet.contains(Integer.valueOf(i18))) {
            return;
        }
        gVar.b(j14);
        if (mapArr[4].isEmpty()) {
            w(gVar, 4);
        } else if (mapArr[5].isEmpty()) {
            w(gVar, 5);
        }
    }

    public final void x(String str) {
        for (int i11 = 0; i11 < V.length; i11++) {
            this.f57128e[i11].remove(str);
        }
    }

    public final void y(int i11, String str, String str2) {
        HashMap[] mapArr = this.f57128e;
        if (mapArr[i11].isEmpty() || mapArr[i11].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i11];
        map.put(str2, map.get(str));
        mapArr[i11].remove(str);
    }

    public final void z(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f57117t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-40);
        String strB = b("Xmp");
        HashMap[] mapArr = this.f57128e;
        d dVar = (strB == null || !this.f57141s) ? null : (d) mapArr[0].remove("Xmp");
        cVar.a(-1);
        cVar.a(-31);
        H(cVar);
        if (dVar != null) {
            mapArr[0].put("Xmp", dVar);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b3 = bVar.readByte();
            if (b3 == -39 || b3 == -38) {
                cVar.a(-1);
                cVar.a(b3);
                o00.a.k(bVar, cVar);
                return;
            }
            if (b3 != -31) {
                cVar.a(-1);
                cVar.a(b3);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.e(unsignedShort);
                int i11 = unsignedShort - 2;
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i11 > 0) {
                    int i12 = bVar.read(bArr, 0, Math.min(i11, 4096));
                    if (i12 < 0) {
                        break;
                    }
                    cVar.write(bArr, 0, i12);
                    i11 -= i12;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int i13 = unsignedShort2 - 2;
                if (i13 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i13 >= 6) {
                    bVar.readFully(bArr2);
                    if (Arrays.equals(bArr2, f57112c0)) {
                        bVar.a(unsignedShort2 - 8);
                    }
                }
                cVar.a(-1);
                cVar.a(b3);
                cVar.e(unsignedShort2);
                if (i13 >= 6) {
                    i13 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i13 > 0) {
                    int i14 = bVar.read(bArr, 0, Math.min(i13, 4096));
                    if (i14 < 0) {
                        break;
                    }
                    cVar.write(bArr, 0, i14);
                    i13 -= i14;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final String b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarD = d(str);
        if (dVarD != null) {
            if (!Z.contains(str)) {
                return dVarD.i(this.f57130g);
            }
            if (str.equals(txBUGYhC.HaeKihpbjlv)) {
                int i11 = dVarD.f57100a;
                if (i11 == 5 || i11 == 10) {
                    f[] fVarArr = (f[]) dVarD.j(this.f57130g);
                    if (fVarArr == null || fVarArr.length != 3) {
                        Arrays.toString(fVarArr);
                        return null;
                    }
                    f fVar = fVarArr[0];
                    Integer numValueOf = Integer.valueOf((int) (fVar.f57108a / fVar.f57109b));
                    f fVar2 = fVarArr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (fVar2.f57108a / fVar2.f57109b));
                    f fVar3 = fVarArr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f57108a / fVar3.f57109b)));
                }
            } else {
                try {
                    return Double.toString(dVarD.g(this.f57130g));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public h(FileDescriptor fileDescriptor) throws Throwable {
        boolean z11;
        FileInputStream fileInputStream;
        Throwable th2;
        e[][] eVarArr = V;
        this.f57128e = new HashMap[eVarArr.length];
        this.f57129f = new HashSet(eVarArr.length);
        this.f57130g = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f57126c = null;
            this.f57124a = null;
            try {
                i.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                this.f57125b = fileDescriptor;
                try {
                    fileDescriptor = i.b(fileDescriptor);
                    z11 = true;
                } catch (Exception e8) {
                    throw new IOException("Failed to duplicate file descriptor", e8);
                }
            } catch (Exception unused) {
                this.f57125b = null;
                z11 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    r(fileInputStream);
                    o00.a.i(fileInputStream);
                    if (z11) {
                        try {
                            i.a(fileDescriptor);
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    o00.a.i(fileInputStream);
                    if (z11) {
                        try {
                            i.a(fileDescriptor);
                        } catch (Exception unused3) {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream = null;
                th2 = th4;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public h(InputStream inputStream) throws IOException {
        e[][] eVarArr = V;
        this.f57128e = new HashMap[eVarArr.length];
        this.f57129f = new HashSet(eVarArr.length);
        this.f57130g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f57124a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f57126c = (AssetManager.AssetInputStream) inputStream;
                this.f57125b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    i.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f57126c = null;
                    this.f57125b = fileInputStream.getFD();
                } catch (Exception unused) {
                    this.f57126c = null;
                    this.f57125b = null;
                }
            } else {
                this.f57126c = null;
                this.f57125b = null;
            }
            r(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
