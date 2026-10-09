package com.yalantis.ucrop.util;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.system.OsConstants;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import o00.a;
import y5.h;
import y5.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class ImageHeaderParser {
    private static final int EXIF_MAGIC_NUMBER = 65496;
    private static final int EXIF_SEGMENT_TYPE = 225;
    private static final int INTEL_TIFF_MAGIC_NUMBER = 18761;
    private static final int MARKER_EOI = 217;
    private static final int MOTOROLA_TIFF_MAGIC_NUMBER = 19789;
    private static final int ORIENTATION_TAG_TYPE = 274;
    private static final int SEGMENT_SOS = 218;
    private static final int SEGMENT_START_ID = 255;
    private static final String TAG = "ImageHeaderParser";
    public static final int UNKNOWN_ORIENTATION = -1;
    private final Reader reader;
    private static final String JPEG_EXIF_SEGMENT_PREAMBLE = "Exif\u0000\u0000";
    private static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = JPEG_EXIF_SEGMENT_PREAMBLE.getBytes(Charset.forName(Constants.ENCODING));
    private static final int[] BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class RandomAccessReader {
        private final ByteBuffer data;

        public RandomAccessReader(byte[] bArr, int i11) {
            this.data = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i11);
        }

        public short getInt16(int i11) {
            return this.data.getShort(i11);
        }

        public int getInt32(int i11) {
            return this.data.getInt(i11);
        }

        public int length() {
            return this.data.remaining();
        }

        public void order(ByteOrder byteOrder) {
            this.data.order(byteOrder);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Reader {
        int getUInt16();

        short getUInt8();

        int read(byte[] bArr, int i11);

        long skip(long j11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class StreamReader implements Reader {
        private final InputStream is;

        public StreamReader(InputStream inputStream) {
            this.is = inputStream;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int getUInt16() {
            return ((this.is.read() << 8) & 65280) | (this.is.read() & ImageHeaderParser.SEGMENT_START_ID);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public short getUInt8() {
            return (short) (this.is.read() & ImageHeaderParser.SEGMENT_START_ID);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int read(byte[] bArr, int i11) throws IOException {
            int i12 = i11;
            while (i12 > 0) {
                int i13 = this.is.read(bArr, i11 - i12, i12);
                if (i13 == -1) {
                    break;
                }
                i12 -= i13;
            }
            return i11 - i12;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public long skip(long j11) throws IOException {
            if (j11 < 0) {
                return 0L;
            }
            long j12 = j11;
            while (j12 > 0) {
                long jSkip = this.is.skip(j12);
                if (jSkip <= 0) {
                    if (this.is.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j12 -= jSkip;
            }
            return j11 - j12;
        }
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.reader = new StreamReader(inputStream);
    }

    private static int calcTagOffset(int i11, int i12) {
        return (i12 * 12) + i11 + 2;
    }

    public static void copyExif(h hVar, int i11, int i12, String str) throws Throwable {
        try {
            copyExifAttributes(hVar, new h(str), i11, i12);
        } catch (IOException e8) {
            e8.getMessage();
        }
    }

    private static boolean handles(int i11) {
        return (i11 & EXIF_MAGIC_NUMBER) == EXIF_MAGIC_NUMBER || i11 == MOTOROLA_TIFF_MAGIC_NUMBER || i11 == INTEL_TIFF_MAGIC_NUMBER;
    }

    private boolean hasJpegExifPreamble(byte[] bArr, int i11) {
        boolean z11 = bArr != null && i11 > JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length;
        if (z11) {
            int i12 = 0;
            while (true) {
                byte[] bArr2 = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
                if (i12 >= bArr2.length) {
                    break;
                }
                if (bArr[i12] != bArr2[i12]) {
                    return false;
                }
                i12++;
            }
        }
        return z11;
    }

    private int moveToExifSegmentAndGetLength() {
        short uInt8;
        while (this.reader.getUInt8() == SEGMENT_START_ID && (uInt8 = this.reader.getUInt8()) != SEGMENT_SOS && uInt8 != MARKER_EOI) {
            int uInt16 = this.reader.getUInt16() - 2;
            if (uInt8 == EXIF_SEGMENT_TYPE) {
                return uInt16;
            }
            long j11 = uInt16;
            if (this.reader.skip(j11) != j11) {
                return -1;
            }
        }
        return -1;
    }

    private int parseExifSegment(byte[] bArr, int i11) {
        if (this.reader.read(bArr, i11) == i11 && hasJpegExifPreamble(bArr, i11)) {
            return parseExifSegment(new RandomAccessReader(bArr, i11));
        }
        return -1;
    }

    public int getOrientation() {
        int iMoveToExifSegmentAndGetLength;
        if (handles(this.reader.getUInt16()) && (iMoveToExifSegmentAndGetLength = moveToExifSegmentAndGetLength()) != -1) {
            return parseExifSegment(new byte[iMoveToExifSegmentAndGetLength], iMoveToExifSegmentAndGetLength);
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:92:0x0162 A[Catch: all -> 0x0172, Exception -> 0x0175, TryCatch #17 {Exception -> 0x0175, all -> 0x0172, blocks: (B:90:0x015e, B:92:0x0162, B:99:0x0180, B:98:0x0178), top: B:143:0x015e }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0178 A[Catch: all -> 0x0172, Exception -> 0x0175, TryCatch #17 {Exception -> 0x0175, all -> 0x0172, blocks: (B:90:0x015e, B:92:0x0162, B:99:0x0180, B:98:0x0178), top: B:143:0x015e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.io.BufferedInputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r25v0, types: [y5.h] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    private static void copyExifAttributes(h hVar, h hVar2, int i11, int i12) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        ?? r14;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream3;
        Object obj;
        FileOutputStream fileOutputStream4;
        ?? bufferedInputStream = "GPSLongitude";
        String str = gkbGsXmgaxRjJ.ArMNyUSgr;
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", str, "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        for (int i13 = 0; i13 < 22; i13++) {
            String str2 = strArr[i13];
            String strB = hVar.b(str2);
            if (!TextUtils.isEmpty(strB)) {
                hVar2.C(str2, strB);
            }
        }
        hVar2.C("ImageWidth", String.valueOf(i11));
        hVar2.C("ImageLength", String.valueOf(i12));
        hVar2.C("Orientation", "0");
        int i14 = hVar2.f57127d;
        if (i14 != 4 && i14 != 13 && i14 != 14) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (hVar2.f57125b == null && hVar2.f57124a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (hVar2.f57131h && hVar2.f57132i && !hVar2.f57133j) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int i15 = hVar2.f57136n;
        FileInputStream fileInputStream3 = null;
        ?? r9 = 0;
        FileInputStream fileInputStream4 = null;
        fileInputStream3 = null;
        hVar2.m = (i15 == 6 || i15 == 7) ? hVar2.m() : null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (hVar2.f57124a != null) {
                fileInputStream = new FileInputStream(hVar2.f57124a);
            } else {
                i.c(hVar2.f57125b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(hVar2.f57125b);
            }
            FileInputStream fileInputStream5 = fileInputStream;
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    a.k(fileInputStream5, fileOutputStream);
                    a.i(fileInputStream5);
                    a.i(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream6 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (hVar2.f57124a != null) {
                                        fileOutputStream4 = new FileOutputStream(hVar2.f57124a);
                                    } else {
                                        i.c(hVar2.f57125b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream4 = new FileOutputStream(hVar2.f57125b);
                                    }
                                    fileOutputStream2 = fileOutputStream4;
                                    try {
                                        bufferedInputStream = new BufferedInputStream(fileInputStream6);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                                            try {
                                                int i16 = hVar2.f57127d;
                                                if (i16 == 4) {
                                                    hVar2.z(bufferedInputStream, bufferedOutputStream);
                                                } else if (i16 == 13) {
                                                    hVar2.A(bufferedInputStream, bufferedOutputStream);
                                                } else if (i16 == 14) {
                                                    hVar2.B(bufferedInputStream, bufferedOutputStream);
                                                }
                                                a.i(bufferedInputStream);
                                                a.i(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                hVar2.m = null;
                                            } catch (Exception e8) {
                                                e = e8;
                                                fileInputStream4 = fileInputStream6;
                                                try {
                                                    try {
                                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                        try {
                                                            if (hVar2.f57124a == null) {
                                                                i.c(hVar2.f57125b, 0L, OsConstants.SEEK_SET);
                                                                fileOutputStream3 = new FileOutputStream(hVar2.f57125b);
                                                            } else {
                                                                fileOutputStream3 = new FileOutputStream(hVar2.f57124a);
                                                            }
                                                            fileOutputStream2 = fileOutputStream3;
                                                            a.k(fileInputStream2, fileOutputStream2);
                                                            a.i(fileInputStream2);
                                                            a.i(fileOutputStream2);
                                                            throw new IOException("Failed to save new file", e);
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            fileInputStream4 = fileInputStream2;
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            fileInputStream4 = fileInputStream2;
                                                            a.i(fileInputStream4);
                                                            a.i(fileOutputStream2);
                                                            throw th;
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            str = null;
                                            r9 = bufferedInputStream;
                                            r14 = str;
                                            a.i(r9);
                                            a.i(r14);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        obj = null;
                                        fileInputStream4 = fileInputStream6;
                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                        if (hVar2.f57124a == null) {
                                            i.c(hVar2.f57125b, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream3 = new FileOutputStream(hVar2.f57125b);
                                        } else {
                                            fileOutputStream3 = new FileOutputStream(hVar2.f57124a);
                                        }
                                        fileOutputStream2 = fileOutputStream3;
                                        a.k(fileInputStream2, fileOutputStream2);
                                        a.i(fileInputStream2);
                                        a.i(fileOutputStream2);
                                        throw new IOException("Failed to save new file", e);
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    fileOutputStream2 = null;
                                    obj = null;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                r14 = 0;
                                a.i(r9);
                                a.i(r14);
                                if (0 == 0) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            fileOutputStream2 = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Exception e16) {
                    e = e16;
                    fileInputStream3 = fileInputStream5;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th7) {
                        th = th7;
                        a.i(fileInputStream3);
                        a.i(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    fileInputStream3 = fileInputStream5;
                    a.i(fileInputStream3);
                    a.i(fileOutputStream);
                    throw th;
                }
            } catch (Exception e17) {
                e = e17;
                fileOutputStream = null;
            } catch (Throwable th9) {
                th = th9;
                fileOutputStream = null;
            }
        } catch (Exception e18) {
            e = e18;
            fileOutputStream = null;
        } catch (Throwable th10) {
            th = th10;
            fileOutputStream = null;
        }
    }

    public static void copyExif(Context context, int i11, int i12, Uri uri, String str) {
        if (context == null) {
            return;
        }
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                try {
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    copyExifAttributes(new h(inputStreamOpenInputStream), new h(str), i11, i12);
                    inputStreamOpenInputStream.close();
                } catch (Throwable th2) {
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e8) {
                            e8.getMessage();
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                e10.getMessage();
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
            }
        } catch (IOException e11) {
            e11.getMessage();
        }
    }

    private static int parseExifSegment(RandomAccessReader randomAccessReader) {
        ByteOrder byteOrder;
        short int16;
        int int32;
        int i11;
        int i12;
        short int17 = randomAccessReader.getInt16(6);
        if (int17 != MOTOROLA_TIFF_MAGIC_NUMBER && int17 == INTEL_TIFF_MAGIC_NUMBER) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        randomAccessReader.order(byteOrder);
        int int33 = randomAccessReader.getInt32(10) + 6;
        short int18 = randomAccessReader.getInt16(int33);
        for (int i13 = 0; i13 < int18; i13++) {
            int iCalcTagOffset = calcTagOffset(int33, i13);
            if (randomAccessReader.getInt16(iCalcTagOffset) == ORIENTATION_TAG_TYPE && (int16 = randomAccessReader.getInt16(iCalcTagOffset + 2)) >= 1 && int16 <= 12 && (int32 = randomAccessReader.getInt32(iCalcTagOffset + 4)) >= 0 && (i11 = int32 + BYTES_PER_FORMAT[int16]) <= 4 && (i12 = iCalcTagOffset + 8) >= 0 && i12 <= randomAccessReader.length() && i11 >= 0 && i11 + i12 <= randomAccessReader.length()) {
                return randomAccessReader.getInt16(i12);
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[SYNTHETIC] */
    public static void copyExif(Context context, int i11, int i12, Uri uri, Uri uri2) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptor;
        if (context == null) {
            return;
        }
        InputStream inputStream = null;
        parcelFileDescriptorOpenFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = null;
        inputStream = null;
        try {
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    h hVar = new h(inputStreamOpenInputStream);
                    parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri2, "rw");
                    copyExifAttributes(hVar, new h(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), i11, i12);
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException e8) {
                        e8.getMessage();
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException e10) {
                    e = e10;
                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                    inputStream = inputStreamOpenInputStream;
                    try {
                        e.getMessage();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e11) {
                                e11.getMessage();
                            }
                        }
                        if (parcelFileDescriptor == null) {
                        } else {
                            parcelFileDescriptor.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e12) {
                                e12.getMessage();
                            }
                        }
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                                throw th;
                            } catch (IOException e13) {
                                e13.getMessage();
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                    inputStream = inputStreamOpenInputStream;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (IOException e14) {
                e14.getMessage();
            }
        } catch (IOException e15) {
            e = e15;
            parcelFileDescriptor = null;
        } catch (Throwable th4) {
            th = th4;
            parcelFileDescriptor = null;
        }
    }

    public static void copyExif(Context context, h hVar, int i11, int i12, Uri uri) {
        if (context == null) {
            return;
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = null;
        try {
            try {
                try {
                    parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                    copyExifAttributes(hVar, new h(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), i11, i12);
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th2) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (IOException e8) {
                            e8.getMessage();
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                e10.getMessage();
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
            }
        } catch (IOException e11) {
            e11.getMessage();
        }
    }
}
