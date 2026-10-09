package com.google.common.io;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.google.common.base.StandardSystemProperty;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.FileAttribute;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class TempFileCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TempFileCreator f17458a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class JavaIoCreator extends TempFileCreator {
        private JavaIoCreator() {
            super(0);
        }

        @Override // com.google.common.io.TempFileCreator
        public final File a() {
            return File.createTempFile("FileBackedOutputStream", null, null);
        }

        public /* synthetic */ JavaIoCreator(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class JavaNioCreator extends TempFileCreator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PermissionSupplier f17459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final PermissionSupplier f17460c = null;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface PermissionSupplier {
            FileAttribute get();
        }

        static {
            PermissionSupplier permissionSupplier;
            Set<String> setSupportedFileAttributeViews = FileSystems.getDefault().supportedFileAttributeViews();
            if (setSupportedFileAttributeViews.contains("posix")) {
                f17459b = new a(1);
                return;
            }
            if (!setSupportedFileAttributeViews.contains(RequestParameters.SUBRESOURCE_ACL)) {
                f17459b = new a(2);
                return;
            }
            try {
                final ImmutableList immutableListU = ImmutableList.u(AclEntry.newBuilder().setType(AclEntryType.ALLOW).setPrincipal(FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName(d())).setPermissions(EnumSet.allOf(AclEntryPermission.class)).setFlags(AclEntryFlag.DIRECTORY_INHERIT, AclEntryFlag.FILE_INHERIT).build());
                final FileAttribute<ImmutableList<AclEntry>> fileAttribute = new FileAttribute<ImmutableList<AclEntry>>() { // from class: com.google.common.io.TempFileCreator.JavaNioCreator.1
                    @Override // java.nio.file.attribute.FileAttribute
                    public final String name() {
                        return "acl:acl";
                    }

                    @Override // java.nio.file.attribute.FileAttribute
                    public final ImmutableList<AclEntry> value() {
                        return immutableListU;
                    }
                };
                final int i11 = 0;
                permissionSupplier = new PermissionSupplier() { // from class: com.google.common.io.b
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() throws IOException {
                        int i12 = i11;
                        Object obj = fileAttribute;
                        switch (i12) {
                            case 0:
                                FileAttribute fileAttribute2 = (FileAttribute) obj;
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier2 = TempFileCreator.JavaNioCreator.f17459b;
                                return fileAttribute2;
                            default:
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier3 = TempFileCreator.JavaNioCreator.f17459b;
                                throw new IOException("Could not find user", (IOException) obj);
                        }
                    }
                };
            } catch (IOException e8) {
                final int i12 = 1;
                permissionSupplier = new PermissionSupplier() { // from class: com.google.common.io.b
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() throws IOException {
                        int i13 = i12;
                        Object obj = e8;
                        switch (i13) {
                            case 0:
                                FileAttribute fileAttribute2 = (FileAttribute) obj;
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier2 = TempFileCreator.JavaNioCreator.f17459b;
                                return fileAttribute2;
                            default:
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier3 = TempFileCreator.JavaNioCreator.f17459b;
                                throw new IOException("Could not find user", (IOException) obj);
                        }
                    }
                };
            }
            f17459b = permissionSupplier;
        }

        private JavaNioCreator() {
            super(0);
        }

        public static /* synthetic */ void c() throws IOException {
            throw new IOException("unrecognized FileSystem type " + FileSystems.getDefault());
        }

        @Override // com.google.common.io.TempFileCreator
        public final File a() {
            return java.nio.file.Files.createTempFile(Paths.get(StandardSystemProperty.JAVA_IO_TMPDIR.a(), new String[0]), "FileBackedOutputStream", null, f17459b.get()).toFile();
        }

        public /* synthetic */ JavaNioCreator(int i11) {
            this();
        }

        public static String d() {
            String strA = StandardSystemProperty.USER_NAME.a();
            Objects.requireNonNull(strA);
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle");
                Class<?> cls2 = Class.forName("java.lang.ProcessHandle$Info");
                Class<?> cls3 = Class.forName("java.util.Optional");
                Method method = cls.getMethod(ualZoVVCQs.bKV, null);
                Method method2 = cls.getMethod("info", null);
                Object objInvoke = cls3.getMethod("orElse", Object.class).invoke(cls2.getMethod("user", null).invoke(method2.invoke(method.invoke(null, null), null), null), strA);
                Objects.requireNonNull(objInvoke);
                return (String) objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException unused) {
                return strA;
            } catch (InvocationTargetException e8) {
                Throwables.a(e8.getCause());
                return strA;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ThrowingCreator extends TempFileCreator {
        private ThrowingCreator() {
            super(0);
        }

        @Override // com.google.common.io.TempFileCreator
        public final File a() throws IOException {
            throw new IOException("Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().");
        }

        public /* synthetic */ ThrowingCreator(int i11) {
            this();
        }
    }

    static {
        TempFileCreator throwingCreator;
        int i11 = 0;
        try {
            try {
                Class.forName("java.nio.file.Path");
                throwingCreator = new JavaNioCreator(i11);
            } catch (ClassNotFoundException unused) {
                throwingCreator = ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue() ? new ThrowingCreator(i11) : new JavaIoCreator(i11);
            }
        } catch (ClassNotFoundException unused2) {
            throwingCreator = new ThrowingCreator(i11);
        } catch (IllegalAccessException unused3) {
            throwingCreator = new ThrowingCreator(i11);
        } catch (NoSuchFieldException unused4) {
            throwingCreator = new ThrowingCreator(i11);
        }
        f17458a = throwingCreator;
    }

    public /* synthetic */ TempFileCreator(int i11) {
        this();
    }

    public abstract File a();

    private TempFileCreator() {
    }
}
