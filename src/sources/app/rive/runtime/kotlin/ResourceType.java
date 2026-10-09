package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.File;
import dl.ExOZ.xItStCyvVEZ;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResourceType {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final ResourceType makeMaybeResource(Object obj) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof Integer) {
                return new ResourceId(((Number) obj).intValue());
            }
            if (obj instanceof String) {
                return new ResourceUrl((String) obj);
            }
            if (obj instanceof byte[]) {
                return new ResourceBytes((byte[]) obj);
            }
            if (obj instanceof File) {
                return new ResourceRiveFile((File) obj);
            }
            throw new IllegalArgumentException("Incompatible type " + obj.getClass().getSimpleName() + '.');
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ResourceBytes extends ResourceType {
        public static final int $stable = 8;
        private final byte[] bytes;

        public final byte[] getBytes() {
            return this.bytes;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceBytes(byte[] bArr) {
            super(null);
            m.f(bArr, xItStCyvVEZ.ZGK);
            this.bytes = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ResourceId extends ResourceType {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f2818id;

        public ResourceId(int i11) {
            super(null);
            this.f2818id = i11;
        }

        public final int getId() {
            return this.f2818id;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ResourceRiveFile extends ResourceType {
        public static final int $stable = 8;
        private final File file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceRiveFile(File file) {
            super(null);
            m.f(file, "file");
            this.file = file;
        }

        public final File getFile() {
            return this.file;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ResourceUrl extends ResourceType {
        public static final int $stable = 0;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceUrl(String url) {
            super(null);
            m.f(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    public /* synthetic */ ResourceType(f fVar) {
        this();
    }

    private ResourceType() {
    }
}
