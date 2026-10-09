package com.google.common.io;

import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.common.base.Predicate;
import com.google.common.graph.SuccessorsFunction;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Files {

    /* JADX INFO: renamed from: com.google.common.io.Files$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements LineProcessor<List<String>> {
        public AnonymousClass1() {
            new ArrayList();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FileByteSink extends ByteSink {
        public final String toString() {
            return "Files.asByteSink(null, null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FileByteSource extends ByteSource {
        public final String toString() {
            return ypOOxsaJG.WAnFr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum FilePredicate implements Predicate<File> {
        IS_DIRECTORY { // from class: com.google.common.io.Files.FilePredicate.1
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return ((File) obj).isDirectory();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Files.isDirectory()";
            }
        },
        IS_FILE { // from class: com.google.common.io.Files.FilePredicate.2
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return ((File) obj).isFile();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Files.isFile()";
            }
        }
    }

    static {
        new SuccessorsFunction<File>() { // from class: com.google.common.io.Files.2
        };
    }

    private Files() {
    }

    public static void a(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Unable to create parent directories of " + file);
    }
}
