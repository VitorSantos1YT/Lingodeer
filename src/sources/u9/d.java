package u9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import f0.g1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import nv.p;
import re.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f52861a = new v(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f52862b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f52863c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f52864d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f52865e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f52866f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f52867g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f52868h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f52869i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f52870j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            deflater.end();
            throw th4;
        }
    }

    public static byte[] b(a[] aVarArr, byte[] bArr) throws IOException {
        int i11 = 0;
        int length = 0;
        for (a aVar : aVarArr) {
            length += ((((aVar.f52858g * 2) + 7) & (-8)) / 8) + (aVar.f52856e * 2) + d(aVar.f52852a, aVar.f52853b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f52857f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f52866f)) {
            int length2 = aVarArr.length;
            while (i11 < length2) {
                a aVar2 = aVarArr[i11];
                q(byteArrayOutputStream, aVar2, d(aVar2.f52852a, aVar2.f52853b, bArr));
                p(byteArrayOutputStream, aVar2);
                i11++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                q(byteArrayOutputStream, aVar3, d(aVar3.f52852a, aVar3.f52853b, bArr));
            }
            int length3 = aVarArr.length;
            while (i11 < length3) {
                p(byteArrayOutputStream, aVarArr[i11]);
                i11++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z11 = true;
        for (File file2 : fileArrListFiles) {
            z11 = c(file2) && z11;
        }
        return z11;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f52868h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f52867g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return ep.a.k(ep.a.n(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i12, i11 - i12);
            if (i13 < 0) {
                throw new IllegalStateException(p.j(i11, "Not enough bytes to read: "));
            }
            i12 += i13;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i11) {
        int[] iArr = new int[i11];
        int iM = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i12] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i11, int i12) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i12];
            byte[] bArr2 = new byte[2048];
            int i13 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i13 < i11) {
                int i14 = fileInputStream.read(bArr2);
                if (i14 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i11 + " bytes");
                }
                inflater.setInput(bArr2, 0, i14);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i12 - iInflate);
                    i13 += i14;
                } catch (DataFormatException e8) {
                    throw new IllegalStateException(e8.getMessage());
                }
            }
            if (i13 == i11) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i11 + " actual=" + i13);
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    public static a[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) throws IOException {
        byte[] bArr3 = f52869i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f52870j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                a[] aVarArrK = k(byteArrayInputStream, bArr2, iM, aVarArr);
                byteArrayInputStream.close();
                return aVarArrK;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(f52864d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            a[] aVarArrJ = j(byteArrayInputStream2, iM2, aVarArr);
            byteArrayInputStream2.close();
            return aVarArrJ;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static a[] j(ByteArrayInputStream byteArrayInputStream, int i11, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i11 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i11];
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i12] = (int) m(byteArrayInputStream, 2);
            strArr[i12] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            a aVar = aVarArr[i13];
            if (!aVar.f52853b.equals(strArr[i13])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i14 = iArr[i13];
            aVar.f52856e = i14;
            aVar.f52859h = g(byteArrayInputStream, i14);
        }
        return aVarArr;
    }

    public static a[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i11, a[] aVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i11 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            a aVar = null;
            if (aVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i13 = 0; i13 < aVarArr.length; i13++) {
                    if (aVarArr[i13].f52853b.equals(strSubstring)) {
                        aVar = aVarArr[i13];
                        break;
                    }
                }
            }
            if (aVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            aVar.f52855d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f52868h)) {
                aVar.f52856e = iM;
                aVar.f52859h = iArrG;
            }
        }
        return aVarArr;
    }

    public static a[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f52865e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            a[] aVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return aVarArrN;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long m(InputStream inputStream, int i11) throws IOException {
        byte[] bArrF = f(inputStream, i11);
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 += ((long) (bArrF[i12] & 255)) << (i12 * 8);
        }
        return j11;
    }

    public static a[] n(ByteArrayInputStream byteArrayInputStream, String str, int i11) throws IOException {
        int i12 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            aVarArr[i13] = new a(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        int i14 = 0;
        while (i14 < i11) {
            a aVar = aVarArr[i14];
            int iAvailable = byteArrayInputStream.available();
            int i15 = aVar.f52857f;
            int i16 = aVar.f52858g;
            TreeMap treeMap = aVar.f52860i;
            int i17 = iAvailable - i15;
            int iM3 = i12;
            while (byteArrayInputStream.available() > i17) {
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                int iM4 = (int) m(byteArrayInputStream, 2);
                while (iM4 > 0) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            int i18 = i12;
                            int i19 = i14;
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                            i12 = i18;
                            i14 = i19;
                        }
                    }
                    iM4--;
                    i12 = i12;
                    i14 = i14;
                }
            }
            int i21 = i12;
            int i22 = i14;
            if (byteArrayInputStream.available() != i17) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            aVar.f52859h = g(byteArrayInputStream, aVar.f52856e);
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i16 * 2) + 7) & (-8)) / 8));
            for (int i23 = i21; i23 < i16; i23++) {
                int i24 = bitSetValueOf.get(i23) ? 2 : i21;
                if (bitSetValueOf.get(i23 + i16)) {
                    i24 |= 4;
                }
                if (i24 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i23));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i21);
                    }
                    treeMap.put(Integer.valueOf(i23), Integer.valueOf(i24 | numValueOf.intValue()));
                }
            }
            i14 = i22 + 1;
            i12 = i21;
        }
        return aVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f52864d;
        int i11 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f52865e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(aVarArr, bArr3);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f52867g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, aVarArr.length, 1);
                for (a aVar : aVarArr) {
                    int size = aVar.f52860i.size() * 4;
                    String strD = d(aVar.f52852a, aVar.f52853b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, aVar.f52859h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, aVar.f52854c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = aVar.f52860i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i12 : aVar.f52859h) {
                        v(byteArrayOutputStream, i12);
                    }
                }
                return true;
            }
            byte[] bArr5 = f52866f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(aVarArr, bArr5);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f52868h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, aVarArr.length);
            for (a aVar2 : aVarArr) {
                String str = aVar2.f52852a;
                TreeMap treeMap = aVar2.f52860i;
                String strD2 = d(str, aVar2.f52853b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, aVar2.f52859h.length);
                u(byteArrayOutputStream, aVar2.f52854c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i13 : aVar2.f52859h) {
                    v(byteArrayOutputStream, i13);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, aVarArr.length);
            int i14 = 2;
            int i15 = 2;
            for (a aVar3 : aVarArr) {
                u(byteArrayOutputStream2, aVar3.f52854c, 4);
                u(byteArrayOutputStream2, aVar3.f52855d, 4);
                u(byteArrayOutputStream2, aVar3.f52858g, 4);
                String strD3 = d(aVar3.f52852a, aVar3.f52853b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i15 = i15 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i15 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray.length);
            }
            i iVar = new i(b.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(iVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i16 = 0;
            for (int i17 = 0; i17 < aVarArr.length; i17++) {
                try {
                    a aVar4 = aVarArr[i17];
                    v(byteArrayOutputStream3, i17);
                    v(byteArrayOutputStream3, aVar4.f52856e);
                    i16 = i16 + 4 + (aVar4.f52856e * i14);
                    int[] iArr = aVar4.f52859h;
                    int length3 = iArr.length;
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < length3) {
                        int i21 = iArr[i18];
                        v(byteArrayOutputStream3, i21 - i19);
                        i18++;
                        i14 = i14;
                        i19 = i21;
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray2.length);
            }
            i iVar2 = new i(b.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i22 = 0;
            int i23 = 0;
            while (i22 < aVarArr.length) {
                try {
                    a aVar5 = aVarArr[i22];
                    Iterator it3 = aVar5.f52860i.entrySet().iterator();
                    int iIntValue = i11;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream5, iIntValue, aVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream6, aVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            v(byteArrayOutputStream4, i22);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i24 = i23 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream4, length4, 4);
                            v(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i23 = i24 + length4;
                            i22++;
                            arrayList3 = arrayList4;
                            i11 = 0;
                        } catch (Throwable th4) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th8;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                        throw th8;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i23 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i23 + ", does not match actual size " + byteArray5.length);
            }
            i iVar3 = new i(b.METHODS, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(iVar3);
            long j11 = 4;
            long size2 = j11 + j11 + 4 + ((long) (arrayList2.size() * 16));
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i25 = 0;
            while (i25 < arrayList2.size()) {
                i iVar4 = (i) arrayList2.get(i25);
                b bVar = iVar4.f52878a;
                byte[] bArr7 = iVar4.f52879b;
                u(byteArrayOutputStream, bVar.a(), 4);
                u(byteArrayOutputStream, size2, 4);
                if (iVar4.f52880c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i25++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
            }
            return true;
        } catch (Throwable th10) {
            try {
                byteArrayOutputStream2.close();
                throw th10;
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
                throw th10;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        s(byteArrayOutputStream, aVar);
        int i11 = aVar.f52858g;
        int[] iArr = aVar.f52859h;
        int length = iArr.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int i14 = iArr[i12];
            v(byteArrayOutputStream, i14 - i13);
            i12++;
            i13 = i14;
        }
        byte[] bArr = new byte[(((i11 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f52860i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i15 = iIntValue / 8;
                bArr[i15] = (byte) (bArr[i15] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i16 = iIntValue + i11;
                int i17 = i16 / 8;
                bArr[i17] = (byte) ((1 << (i16 % 8)) | bArr[i17]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, aVar.f52856e);
        u(byteArrayOutputStream, aVar.f52857f, 4);
        u(byteArrayOutputStream, aVar.f52854c, 4);
        u(byteArrayOutputStream, aVar.f52858g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i11, a aVar) throws IOException {
        int i12 = aVar.f52858g;
        byte[] bArr = new byte[(((Integer.bitCount(i11 & (-2)) * i12) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f52860i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i13 = 0;
            for (int i14 = 1; i14 <= 4; i14 <<= 1) {
                if (i14 != 1 && (i14 & i11) != 0) {
                    if ((i14 & iIntValue2) == i14) {
                        int i15 = (i13 * i12) + iIntValue;
                        int i16 = i15 / 8;
                        bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
                    }
                    i13++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        int i11 = 0;
        for (Map.Entry entry : aVar.f52860i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i11);
                v(byteArrayOutputStream, 0);
                i11 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x016c A[Catch: all -> 0x0169, TRY_ENTER, TryCatch #2 {all -> 0x0169, blocks: (B:94:0x0148, B:96:0x0154, B:107:0x016c, B:108:0x0171), top: B:257:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x017d A[Catch: IllegalStateException -> 0x0163, IOException -> 0x0165, FileNotFoundException -> 0x0167, TRY_LEAVE, TryCatch #33 {FileNotFoundException -> 0x0167, IOException -> 0x0165, IllegalStateException -> 0x0163, blocks: (B:92:0x0140, B:97:0x015e, B:115:0x017d, B:113:0x017a, B:112:0x0177), top: B:299:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0193  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bd A[Catch: all -> 0x01cb, TRY_LEAVE, TryCatch #25 {all -> 0x01cb, blocks: (B:130:0x01b1, B:132:0x01bd, B:141:0x01ce), top: B:281:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ce A[Catch: all -> 0x01cb, TRY_ENTER, TRY_LEAVE, TryCatch #25 {all -> 0x01cb, blocks: (B:130:0x01b1, B:132:0x01bd, B:141:0x01ce), top: B:281:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:157:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:166:0x021d A[Catch: all -> 0x025b, TryCatch #36 {all -> 0x025b, blocks: (B:164:0x0217, B:166:0x021d, B:167:0x0221, B:169:0x0227), top: B:289:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0227 A[Catch: all -> 0x025b, TRY_LEAVE, TryCatch #36 {all -> 0x025b, blocks: (B:164:0x0217, B:166:0x021d, B:167:0x0221, B:169:0x0227), top: B:289:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:239:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:246:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:257:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0217 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x01ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x022c A[EDGE_INSN: B:300:0x022c->B:171:0x022c BREAK  A[LOOP:0: B:167:0x0221->B:301:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb A[Catch: all -> 0x0100, IllegalStateException -> 0x0103, IOException -> 0x0105, TRY_LEAVE, TryCatch #37 {IOException -> 0x0105, IllegalStateException -> 0x0103, blocks: (B:53:0x00e1, B:55:0x00eb, B:66:0x0107, B:67:0x010c), top: B:296:0x00e1, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0107 A[Catch: all -> 0x0100, IllegalStateException -> 0x0103, IOException -> 0x0105, TRY_ENTER, TryCatch #37 {IOException -> 0x0105, IllegalStateException -> 0x0103, blocks: (B:53:0x00e1, B:55:0x00eb, B:66:0x0107, B:67:0x010c), top: B:296:0x00e1, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0154 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #2 {all -> 0x0169, blocks: (B:94:0x0148, B:96:0x0154, B:107:0x016c, B:108:0x0171), top: B:257:0x0148 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    public static void t(Context context, Executor executor, c cVar, boolean z11) {
        boolean z12;
        ?? D;
        byte[] bArr;
        a[] aVarArrL;
        a[] aVarArr;
        c cVar2;
        a[] aVarArr2;
        byte[] bArr2;
        ?? r9;
        byte[] bArr3;
        ?? r11;
        boolean z13;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th2;
        FileOutputStream fileOutputStream;
        Throwable th3;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr4;
        int i11;
        ?? r12;
        boolean z14;
        boolean z15;
        ?? r13;
        ByteArrayOutputStream byteArrayOutputStream;
        g1 g1Var;
        ?? r14;
        String str;
        FileInputStream fileInputStreamD;
        ?? r15;
        ?? r16;
        boolean z16;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z11) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j11 = dataInputStream.readLong();
                            dataInputStream.close();
                            z16 = j11 == packageInfo.lastUpdateTime;
                            if (z16) {
                                cVar.e(2, null);
                            }
                        } catch (Throwable th4) {
                            try {
                                dataInputStream.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (IOException unused) {
                        z16 = false;
                    }
                } else {
                    z16 = false;
                }
                if (z16) {
                    context.getPackageName();
                    h.c(context, false);
                    return;
                }
            }
            context.getPackageName();
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            g1 g1Var2 = new g1(assets, executor, cVar, name, file2);
            byte[] bArr5 = (byte[]) g1Var2.f26281d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            g1Var2.f26278a = true;
                            D = g1Var2.d(assets, "dexopt/baseline.prof");
                            bArr = f52862b;
                            if (D != 0) {
                                if (Arrays.equals(bArr, f(D, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                aVarArrL = l(D, f(D, 4), (String) g1Var2.f26283f);
                                D.close();
                                g1Var2.f26284g = aVarArrL;
                            }
                            aVarArr = (a[]) g1Var2.f26284g;
                            if (aVarArr != null) {
                                str = "dexopt/baseline.profm";
                                fileInputStreamD = g1Var2.d(assets, "dexopt/baseline.profm");
                                r14 = str;
                                if (fileInputStreamD == null) {
                                    if (fileInputStreamD != null) {
                                        fileInputStreamD.close();
                                        r14 = str;
                                    }
                                    g1Var = null;
                                    D = r14;
                                } else {
                                    if (Arrays.equals(f52863c, f(fileInputStreamD, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrF = f(fileInputStreamD, 4);
                                    g1Var2.f26284g = i(fileInputStreamD, bArrF, bArr5, aVarArr);
                                    fileInputStreamD.close();
                                    g1Var = g1Var2;
                                    D = bArrF;
                                }
                                if (g1Var != null) {
                                    g1Var2 = g1Var;
                                }
                            }
                            cVar2 = (c) g1Var2.f26280c;
                            aVarArr2 = (a[]) g1Var2.f26284g;
                            bArr2 = (byte[]) g1Var2.f26281d;
                            r9 = D;
                            r9 = D;
                            if (aVarArr2 != null) {
                                z15 = g1Var2.f26278a;
                                if (z15) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr2);
                                if (o(byteArrayOutputStream, bArr2, aVarArr2)) {
                                    g1Var2.f26285h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r13 = byteArrayOutputStream;
                                    g1Var2.f26284g = null;
                                    r9 = r13;
                                } else {
                                    cVar2.e(5, null);
                                    g1Var2.f26284g = null;
                                    byteArrayOutputStream.close();
                                    r9 = byteArrayOutputStream;
                                }
                            }
                            bArr3 = (byte[]) g1Var2.f26285h;
                            if (bArr3 != null) {
                                if (g1Var2.f26278a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                fileOutputStream = new FileOutputStream((File) g1Var2.f26282e);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr4 = new byte[512];
                                        while (true) {
                                            i11 = byteArrayInputStream.read(bArr4);
                                            if (i11 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr4, 0, i11);
                                        }
                                        r12 = 1;
                                        g1Var2.e(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        g1Var2.f26285h = null;
                                        g1Var2.f26284g = null;
                                        z13 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z13 = false;
                            r12 = 1;
                            if (z13) {
                                e(packageInfo, filesDir);
                            }
                            z14 = z13;
                            r15 = r12;
                        } else {
                            g1Var2.e(4, null);
                        }
                    } catch (IOException unused2) {
                        z12 = true;
                        g1Var2.e(4, null);
                    }
                } else if (file2.canWrite()) {
                    g1Var2.f26278a = true;
                    try {
                        D = g1Var2.d(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e8) {
                        cVar.e(6, e8);
                        D = 0;
                    } catch (IOException e10) {
                        cVar.e(7, e10);
                        D = 0;
                    }
                    bArr = f52862b;
                    try {
                        if (D != 0) {
                            try {
                                if (Arrays.equals(bArr, f(D, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                aVarArrL = l(D, f(D, 4), (String) g1Var2.f26283f);
                                try {
                                    D.close();
                                } catch (IOException e11) {
                                    cVar.e(7, e11);
                                }
                                g1Var2.f26284g = aVarArrL;
                            } catch (IOException e12) {
                                cVar.e(7, e12);
                                try {
                                    D.close();
                                } catch (IOException e13) {
                                    cVar.e(7, e13);
                                }
                                aVarArrL = null;
                            } catch (IllegalStateException e14) {
                                cVar.e(8, e14);
                                D.close();
                                aVarArrL = null;
                            }
                        }
                        aVarArr = (a[]) g1Var2.f26284g;
                        if (aVarArr != null && ((D = Build.VERSION.SDK_INT) >= 31 || D == 24 || D == 25)) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamD = g1Var2.d(assets, "dexopt/baseline.profm");
                                r14 = str;
                                if (fileInputStreamD == null) {
                                    try {
                                        if (Arrays.equals(f52863c, f(fileInputStreamD, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrF2 = f(fileInputStreamD, 4);
                                        g1Var2.f26284g = i(fileInputStreamD, bArrF2, bArr5, aVarArr);
                                        fileInputStreamD.close();
                                        g1Var = g1Var2;
                                        D = bArrF2;
                                    } catch (Throwable th6) {
                                        try {
                                            fileInputStreamD.close();
                                            throw th6;
                                        } catch (Throwable th7) {
                                            th6.addSuppressed(th7);
                                            throw th6;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamD != null) {
                                        fileInputStreamD.close();
                                        r14 = str;
                                    }
                                    g1Var = null;
                                    D = r14;
                                }
                            } catch (FileNotFoundException e15) {
                                cVar.e(9, e15);
                                r14 = D;
                            } catch (IOException e16) {
                                cVar.e(7, e16);
                                r14 = D;
                            } catch (IllegalStateException e17) {
                                g1Var2.f26284g = null;
                                cVar.e(8, e17);
                                r14 = D;
                            }
                            if (g1Var != null) {
                                g1Var2 = g1Var;
                            }
                        }
                        cVar2 = (c) g1Var2.f26280c;
                        aVarArr2 = (a[]) g1Var2.f26284g;
                        bArr2 = (byte[]) g1Var2.f26281d;
                        r9 = D;
                        r9 = D;
                        if (aVarArr2 != null && bArr2 != null) {
                            z15 = g1Var2.f26278a;
                            if (z15) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr2);
                                    if (o(byteArrayOutputStream, bArr2, aVarArr2)) {
                                        cVar2.e(5, null);
                                        g1Var2.f26284g = null;
                                        byteArrayOutputStream.close();
                                        r9 = byteArrayOutputStream;
                                    } else {
                                        g1Var2.f26285h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r13 = byteArrayOutputStream;
                                        g1Var2.f26284g = null;
                                        r9 = r13;
                                    }
                                } catch (Throwable th8) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th8;
                                    } catch (Throwable th9) {
                                        th8.addSuppressed(th9);
                                        throw th8;
                                    }
                                }
                            } catch (IOException e18) {
                                cVar2.e(7, e18);
                                r13 = z15;
                            } catch (IllegalStateException e19) {
                                cVar2.e(8, e19);
                                r13 = z15;
                            }
                        }
                        bArr3 = (byte[]) g1Var2.f26285h;
                        if (bArr3 != null) {
                            z13 = false;
                            r12 = 1;
                        } else {
                            try {
                                if (g1Var2.f26278a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream((File) g1Var2.f26282e);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr4 = new byte[512];
                                                                                while (true) {
                                                                                    i11 = byteArrayInputStream.read(bArr4);
                                                                                    if (i11 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr4, 0, i11);
                                                                                    }
                                                                                }
                                                                                r12 = 1;
                                                                                g1Var2.e(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                g1Var2.f26285h = null;
                                                                                g1Var2.f26284g = null;
                                                                                z13 = true;
                                                                            }
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                            Throwable th11 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th11;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th11;
                                                                            } catch (Throwable th12) {
                                                                                th11.addSuppressed(th12);
                                                                                throw th11;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th13) {
                                                                    th = th13;
                                                                    Throwable th14 = th;
                                                                    if (channel == null) {
                                                                        throw th14;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th14;
                                                                    } catch (Throwable th15) {
                                                                        th14.addSuppressed(th15);
                                                                        throw th14;
                                                                    }
                                                                }
                                                            } catch (Throwable th16) {
                                                                th = th16;
                                                            }
                                                        } catch (Throwable th17) {
                                                            th = th17;
                                                        }
                                                    } catch (Throwable th18) {
                                                        th = th18;
                                                        th3 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th3;
                                                        } catch (Throwable th19) {
                                                            th3.addSuppressed(th19);
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (Throwable th20) {
                                                    th = th20;
                                                    th3 = th;
                                                    fileOutputStream.close();
                                                    throw th3;
                                                }
                                            } catch (Throwable th21) {
                                                th = th21;
                                                th2 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th2;
                                                } catch (Throwable th22) {
                                                    th2.addSuppressed(th22);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th23) {
                                            th = th23;
                                            th2 = th;
                                            byteArrayInputStream.close();
                                            throw th2;
                                        }
                                    } catch (FileNotFoundException e21) {
                                        e = e21;
                                        r9 = 1;
                                        g1Var2.e(6, e);
                                        r11 = r9;
                                        g1Var2.f26285h = null;
                                        g1Var2.f26284g = null;
                                        z13 = false;
                                        r12 = r11;
                                    } catch (IOException e22) {
                                        e = e22;
                                        r9 = 1;
                                        g1Var2.e(7, e);
                                        r11 = r9;
                                        g1Var2.f26285h = null;
                                        g1Var2.f26284g = null;
                                        z13 = false;
                                        r12 = r11;
                                    }
                                } catch (FileNotFoundException e23) {
                                    e = e23;
                                    g1Var2.e(6, e);
                                    r11 = r9;
                                    g1Var2.f26285h = null;
                                    g1Var2.f26284g = null;
                                    z13 = false;
                                    r12 = r11;
                                } catch (IOException e24) {
                                    e = e24;
                                    g1Var2.e(7, e);
                                    r11 = r9;
                                    g1Var2.f26285h = null;
                                    g1Var2.f26284g = null;
                                    z13 = false;
                                    r12 = r11;
                                }
                            } catch (Throwable th24) {
                                g1Var2.f26285h = null;
                                g1Var2.f26284g = null;
                                throw th24;
                            }
                        }
                        if (z13) {
                            e(packageInfo, filesDir);
                        }
                        z14 = z13;
                        r15 = r12;
                    } catch (Throwable th25) {
                        try {
                            D.close();
                            throw th25;
                        } catch (IOException e25) {
                            cVar.e(7, e25);
                            throw th25;
                        }
                    }
                } else {
                    g1Var2.e(4, null);
                }
                if (z14 || !z11) {
                    r16 = 0;
                } else {
                    r16 = r15;
                }
                h.c(context, r16);
            }
            g1Var2.e(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z12 = true;
            z14 = false;
            r15 = z12;
            if (z14) {
                r16 = 0;
            } else {
                r16 = 0;
            }
            h.c(context, r16);
        } catch (PackageManager.NameNotFoundException e26) {
            cVar.e(7, e26);
            h.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j11, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) ((j11 >> (i12 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i11) throws IOException {
        u(byteArrayOutputStream, i11, 2);
    }
}
