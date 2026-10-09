package m00;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends x {
    public static Long A(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // m00.x, m00.o
    public final e4.e q(a0 path) {
        a0 a0VarM;
        kotlin.jvm.internal.m.f(path, "path");
        Path pathF = path.f();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathF, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathF) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = a0.f40673b;
                a0VarM = p20.c.m(symbolicLink.toString());
            } else {
                a0VarM = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lA = fileTimeCreationTime != null ? A(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lA2 = fileTimeLastModifiedTime != null ? A(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new e4.e(zIsRegularFile, zIsDirectory, a0VarM, lValueOf, lA, lA2, fileTimeLastAccessTime != null ? A(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // m00.x
    public final String toString() {
        return "NioSystemFileSystem";
    }

    @Override // m00.x, m00.o
    public final void b(a0 source, a0 target) throws IOException {
        kotlin.jvm.internal.m.f(source, "source");
        kotlin.jvm.internal.m.f(target, "target");
        try {
            Files.move(source.f(), target.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException(xTCJ.pwIcaNieXhjlr);
        } catch (NoSuchFileException e8) {
            throw new FileNotFoundException(e8.getMessage());
        }
    }
}
