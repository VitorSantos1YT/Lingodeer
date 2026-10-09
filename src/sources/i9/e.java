package i9;

import android.content.SharedPreferences;
import dl.ExOZ.xItStCyvVEZ;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f34269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f34271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f34272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FileChannel f34273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FileLock f34274f;

    public e(File file, File file2) throws Throwable {
        file.getPath();
        file2.getPath();
        this.f34269a = file;
        this.f34271c = file2;
        this.f34270b = b(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f34272d = randomAccessFile;
        try {
            try {
                FileChannel channel = randomAccessFile.getChannel();
                this.f34273e = channel;
                try {
                    file3.getPath();
                    this.f34274f = channel.lock();
                    file3.getPath();
                } catch (IOException e8) {
                    e = e8;
                    try {
                        this.f34273e.close();
                    } catch (IOException unused) {
                    }
                    throw e;
                } catch (Error e10) {
                    e = e10;
                    this.f34273e.close();
                    throw e;
                } catch (RuntimeException e11) {
                    e = e11;
                    this.f34273e.close();
                    throw e;
                }
            } catch (IOException e12) {
                e = e12;
                try {
                    this.f34272d.close();
                } catch (IOException unused2) {
                }
                throw e;
            }
        } catch (Error e13) {
            e = e13;
            this.f34272d.close();
            throw e;
        } catch (RuntimeException e14) {
            e = e14;
            this.f34272d.close();
            throw e;
        }
    }

    public static long b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            f fVarN = qx.b.n(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j11 = fVarN.f34276b;
            randomAccessFile.seek(fVarN.f34275a);
            byte[] bArr = new byte[16384];
            int i11 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j11));
            while (i11 != -1) {
                crc32.update(bArr, 0, i11);
                j11 -= (long) i11;
                if (j11 == 0) {
                    break;
                }
                i11 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j11));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th2) {
            randomAccessFile.close();
            throw th2;
        }
    }

    public static void f(b bVar, long j11, long j12, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = bVar.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong("timestamp", j11);
        editorEdit.putLong("crc", j12);
        editorEdit.putInt("dex.number", arrayList.size() + 1);
        int size = arrayList.size();
        int i11 = 2;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            d dVar = (d) obj;
            editorEdit.putLong(p.j(i11, "dex.crc."), dVar.f34268a);
            editorEdit.putLong("dex.time." + i11, dVar.lastModified());
            i11++;
        }
        editorEdit.commit();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    public final ArrayList c(b bVar, boolean z11) {
        long jLastModified;
        ArrayList arrayListD;
        File file = this.f34269a;
        file.getPath();
        if (!this.f34274f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (z11) {
            ArrayList arrayListE = e();
            jLastModified = file.lastModified();
            if (jLastModified == -1) {
                jLastModified--;
            }
            f(bVar, jLastModified, this.f34270b, arrayListE);
            arrayListD = arrayListE;
        } else {
            SharedPreferences sharedPreferences = bVar.getSharedPreferences("multidex.version", 4);
            long j11 = sharedPreferences.getLong("timestamp", -1L);
            long jLastModified2 = file.lastModified();
            if (jLastModified2 == -1) {
                jLastModified2--;
            }
            if (j11 == jLastModified2 && sharedPreferences.getLong("crc", -1L) == this.f34270b) {
                try {
                    arrayListD = d(bVar);
                } catch (IOException unused) {
                    ArrayList arrayListE2 = e();
                    long jLastModified3 = file.lastModified();
                    if (jLastModified3 == -1) {
                        jLastModified3--;
                    }
                    f(bVar, jLastModified3, this.f34270b, arrayListE2);
                    arrayListD = arrayListE2;
                }
            } else {
                ArrayList arrayListE3 = e();
                jLastModified = file.lastModified();
                if (jLastModified == -1) {
                    jLastModified--;
                }
                f(bVar, jLastModified, this.f34270b, arrayListE3);
                arrayListD = arrayListE3;
            }
        }
        arrayListD.size();
        return arrayListD;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34274f.release();
        this.f34273e.close();
        this.f34272d.close();
    }

    public final ArrayList d(b bVar) throws IOException {
        String str = this.f34269a.getName() + ".classes";
        SharedPreferences sharedPreferences = bVar.getSharedPreferences("multidex.version", 4);
        int i11 = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i11 - 1);
        for (int i12 = 2; i12 <= i11; i12++) {
            d dVar = new d(this.f34271c, str + i12 + ".zip");
            if (!dVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + dVar.getPath() + "'");
            }
            dVar.f34268a = b(dVar);
            long j11 = sharedPreferences.getLong("dex.crc." + i12, -1L);
            long j12 = sharedPreferences.getLong("dex.time." + i12, -1L);
            long jLastModified = dVar.lastModified();
            if (j12 != jLastModified || j11 != dVar.f34268a) {
                StringBuilder sb2 = new StringBuilder("Invalid extracted dex: ");
                sb2.append(dVar);
                sb2.append(" (key \"\"), expected modification time: ");
                sb2.append(j12);
                ep.a.y(jLastModified, ", modification time: ", ", expected crc: ", sb2);
                sb2.append(j11);
                sb2.append(", file crc: ");
                sb2.append(dVar.f34268a);
                throw new IOException(sb2.toString());
            }
            arrayList.add(dVar);
        }
        return arrayList;
    }

    public final ArrayList e() {
        StringBuilder sb2 = new StringBuilder();
        File file = this.f34269a;
        sb2.append(file.getName());
        sb2.append(".classes");
        String string = sb2.toString();
        c cVar = new c();
        File file2 = this.f34271c;
        File[] fileArrListFiles = file2.listFiles(cVar);
        if (fileArrListFiles == null) {
            file2.getPath();
        } else {
            for (File file3 : fileArrListFiles) {
                file3.getPath();
                file3.length();
                if (file3.delete()) {
                    file3.getPath();
                } else {
                    file3.getPath();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("classes");
            int i11 = 2;
            sb3.append(2);
            sb3.append(".dex");
            ZipEntry entry = zipFile.getEntry(sb3.toString());
            while (entry != null) {
                d dVar = new d(file2, string + i11 + ".zip");
                arrayList.add(dVar);
                dVar.toString();
                int i12 = 0;
                boolean z11 = false;
                while (i12 < 3 && !z11) {
                    i12++;
                    a(zipFile, entry, dVar, string);
                    try {
                        dVar.f34268a = b(dVar);
                        z11 = true;
                    } catch (IOException unused) {
                        dVar.getAbsolutePath();
                        z11 = false;
                    }
                    dVar.getAbsolutePath();
                    dVar.length();
                    if (!z11) {
                        dVar.delete();
                        if (dVar.exists()) {
                            dVar.getPath();
                        }
                    }
                }
                if (!z11) {
                    throw new IOException("Could not create zip file " + dVar.getAbsolutePath() + " for secondary dex (" + i11 + ")");
                }
                i11++;
                entry = zipFile.getEntry("classes" + i11 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
            return arrayList;
        } catch (Throwable th2) {
            try {
                zipFile.close();
            } catch (IOException unused3) {
            }
            throw th2;
        }
    }

    public static void a(ZipFile zipFile, ZipEntry zipEntry, d dVar, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(ep.a.e("tmp-", str), ".zip", dVar.getParentFile());
        fileCreateTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i11 = inputStream.read(bArr); i11 != -1; i11 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i11);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (fileCreateTempFile.setReadOnly()) {
                    dVar.getPath();
                    if (fileCreateTempFile.renameTo(dVar)) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                        fileCreateTempFile.delete();
                        return;
                    }
                    throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + dVar.getAbsolutePath() + "\"");
                }
                throw new IOException(xItStCyvVEZ.chYbAhLX + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + dVar.getAbsolutePath() + "\")");
            } catch (Throwable th2) {
                zipOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            fileCreateTempFile.delete();
            throw th3;
        }
    }
}
