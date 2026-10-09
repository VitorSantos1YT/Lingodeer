package cz;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import kotlin.jvm.internal.m;
import ns.o;
import oz.q;
import ry.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends o00.a {
    public static void Q(File file, File target) throws IOException {
        m.f(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.");
        }
        if (target.exists() && !target.delete()) {
            throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new FileSystemException(file, target, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                md.a.e(fileInputStream, fileOutputStream, OSSConstants.DEFAULT_BUFFER_SIZE);
                fileOutputStream.close();
                fileInputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    o.m(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                o.m(fileInputStream, th4);
                throw th5;
            }
        }
    }

    public static void R(File file) {
        j direction = j.BOTTOM_UP;
        m.f(direction, "direction");
        g gVar = new g(new i(file, direction));
        while (true) {
            boolean z11 = true;
            while (gVar.hasNext()) {
                File file2 = (File) gVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z11) {
                    }
                }
                z11 = false;
            }
            return;
        }
    }

    public static byte[] S(File file) throws IOException {
        m.f(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i11 = (int) length;
            byte[] bArrCopyOf = new byte[i11];
            int i12 = i11;
            int i13 = 0;
            while (i12 > 0) {
                int i14 = fileInputStream.read(bArrCopyOf, i13, i12);
                if (i14 < 0) {
                    break;
                }
                i12 -= i14;
                i13 += i14;
            }
            if (i12 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i13);
                m.e(bArrCopyOf, "copyOf(...)");
            } else {
                int i15 = fileInputStream.read();
                if (i15 != -1) {
                    a aVar = new a(8193);
                    aVar.write(i15);
                    md.a.e(fileInputStream, aVar, OSSConstants.DEFAULT_BUFFER_SIZE);
                    int size = aVar.size() + i11;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = aVar.a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    m.e(bArrCopyOf, "copyOf(...)");
                    l.F(i11, 0, aVar.size(), bArrA, bArrCopyOf);
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                o.m(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static String T(File file) throws IOException {
        Charset charset = oz.a.f46133a;
        m.f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strI = ob.f.I(inputStreamReader);
            inputStreamReader.close();
            return strI;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                o.m(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static File U(File file) {
        int length;
        int iH0;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        m.e(path, "getPath(...)");
        char c11 = File.separatorChar;
        int iH1 = q.H0(path, c11, 0, 4);
        if (iH1 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c11 || (iH0 = q.H0(path, c11, 2, 4)) < 0) {
                length = 1;
            } else {
                int iH2 = q.H0(path, c11, iH0 + 1, 4);
                length = iH2 >= 0 ? iH2 + 1 : path.length();
            }
        } else if (iH1 <= 0 || path.charAt(iH1 - 1) != ':') {
            length = (iH1 == -1 && q.A0(path, ':')) ? path.length() : 0;
        } else {
            length = iH1 + 1;
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        m.e(string, "toString(...)");
        if ((string.length() == 0) || q.A0(string, c11)) {
            return new File(string + file2);
        }
        return new File(string + c11 + file2);
    }

    public static void V(File file, String text) {
        Charset charset = oz.a.f46133a;
        m.f(text, "text");
        m.f(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            W(fileOutputStream, text, charset);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                o.m(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final void W(FileOutputStream fileOutputStream, String text, Charset charset) throws IOException {
        m.f(text, "text");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            m.e(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(OSSConstants.DEFAULT_BUFFER_SIZE);
        m.c(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(OSSConstants.DEFAULT_BUFFER_SIZE * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        m.e(byteBufferAllocate, "allocate(...)");
        int i11 = 0;
        int i12 = 0;
        while (i11 < text.length()) {
            int iMin = Math.min(8192 - i12, text.length() - i11);
            int i13 = i11 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            m.e(cArrArray, "array(...)");
            text.getChars(i11, i13, cArrArray, i12);
            charBufferAllocate.limit(iMin + i12);
            i12 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i13 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i12 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i11 = i13;
        }
    }
}
