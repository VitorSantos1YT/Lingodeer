package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.ArtboardException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import hh.p0;
import hz.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import lz.g;
import nv.p;
import ry.n;
import ry.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class File extends NativeObject {
    public static final int $stable = 8;
    private final ReentrantLock lock;
    private final RendererType rendererType;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Enum {
        public static final int $stable = 8;
        private final String name;
        private final List<String> values;

        public Enum(String name, List<String> values) {
            m.f(name, "name");
            m.f(values, "values");
            this.name = name;
            this.values = values;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Enum copy$default(Enum r9, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = r9.name;
            }
            if ((i11 & 2) != 0) {
                list = r9.values;
            }
            return r9.copy(str, list);
        }

        public final String component1() {
            return this.name;
        }

        public final List<String> component2() {
            return this.values;
        }

        public final Enum copy(String name, List<String> values) {
            m.f(name, "name");
            m.f(values, "values");
            return new Enum(name, values);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Enum)) {
                return false;
            }
            Enum r9 = (Enum) obj;
            return m.a(this.name, r9.name) && m.a(this.values, r9.values);
        }

        public final String getName() {
            return this.name;
        }

        public final List<String> getValues() {
            return this.values;
        }

        public int hashCode() {
            return this.values.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return "Enum(name=" + this.name + ", values=" + this.values + ')';
        }
    }

    public /* synthetic */ File(byte[] bArr, RendererType rendererType, FileAssetLoader fileAssetLoader, int i11, f fVar) {
        this(bArr, (i11 & 2) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, (i11 & 4) != 0 ? null : fileAssetLoader);
    }

    private native long cppArtboardByName(long j11, String str);

    private native int cppArtboardCount(long j11);

    private native String cppArtboardNameByIndex(long j11, int i11);

    private native long cppDefaultViewModelForArtboard(long j11, long j12);

    private native List<Enum> cppEnums(long j11);

    private native long cppViewModelByIndex(long j11, int i11);

    private native long cppViewModelByName(long j11, String str);

    private native int cppViewModelCount(long j11);

    /* JADX INFO: renamed from: import, reason: not valid java name */
    private native long m201import(byte[] bArr, int i11, int i12, long j11);

    public Artboard artboard(String name) throws ArtboardException {
        m.f(name, "name");
        long jCppArtboardByName = cppArtboardByName(getCppPointer(), name);
        if (jCppArtboardByName != 0) {
            Artboard artboard = new Artboard(jCppArtboardByName, getLock());
            getDependencies().add(artboard);
            return artboard;
        }
        StringBuilder sbQ = p0.q("Artboard \"", name, "\" not found. Available Artboards: ");
        List<String> artboardNames = getArtboardNames();
        ArrayList arrayList = new ArrayList(n.W(artboardNames, 10));
        Iterator<T> it = artboardNames.iterator();
        while (it.hasNext()) {
            arrayList.add("\"" + ((String) it.next()) + '\"');
        }
        sbQ.append(arrayList);
        throw new ArtboardException(sbQ.toString());
    }

    public native long cppArtboardByIndex(long j11, int i11);

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j11);

    public ViewModel defaultViewModelForArtboard(Artboard artboard) throws ViewModelException {
        m.f(artboard, "artboard");
        long jCppDefaultViewModelForArtboard = cppDefaultViewModelForArtboard(getCppPointer(), artboard.getCppPointer());
        if (jCppDefaultViewModelForArtboard != 0) {
            ViewModel viewModel = new ViewModel(jCppDefaultViewModelForArtboard);
            getDependencies().add(viewModel);
            return viewModel;
        }
        throw new ViewModelException("No default ViewModel found for artboard " + artboard.getName() + '.');
    }

    public int getArtboardCount() {
        return cppArtboardCount(getCppPointer());
    }

    public List<String> getArtboardNames() {
        g gVarU = b.U(0, getArtboardCount());
        ArrayList arrayList = new ArrayList(n.W(gVarU, 10));
        Iterator it = gVarU.iterator();
        while (it.hasNext()) {
            arrayList.add(cppArtboardNameByIndex(getCppPointer(), ((w) it).nextInt()));
        }
        return arrayList;
    }

    public List<Enum> getEnums() {
        return cppEnums(getCppPointer());
    }

    public Artboard getFirstArtboard() {
        return artboard(0);
    }

    public ReentrantLock getLock() {
        return this.lock;
    }

    public RendererType getRendererType() {
        return this.rendererType;
    }

    public ViewModel getViewModelByIndex(int i11) throws ViewModelException {
        long jCppViewModelByIndex = cppViewModelByIndex(getCppPointer(), i11);
        if (jCppViewModelByIndex == 0) {
            throw new ViewModelException(p.o("No ViewModel found at index ", i11, '.'));
        }
        ViewModel viewModel = new ViewModel(jCppViewModelByIndex);
        getDependencies().add(viewModel);
        return viewModel;
    }

    public ViewModel getViewModelByName(String viewModelName) throws ViewModelException {
        m.f(viewModelName, "viewModelName");
        long jCppViewModelByName = cppViewModelByName(getCppPointer(), viewModelName);
        if (jCppViewModelByName == 0) {
            throw new ViewModelException(p.q("No ViewModel found with name ", viewModelName, '.'));
        }
        ViewModel viewModel = new ViewModel(jCppViewModelByName);
        getDependencies().add(viewModel);
        return viewModel;
    }

    public int getViewModelCount() {
        return cppViewModelCount(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject, app.rive.runtime.kotlin.core.RefCount
    public int release() {
        int iRelease;
        synchronized (getLock()) {
            iRelease = super.release();
        }
        return iRelease;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public File(byte[] bytes, RendererType rendererType, FileAssetLoader fileAssetLoader) {
        super(0L);
        m.f(bytes, "bytes");
        m.f(rendererType, "rendererType");
        this.rendererType = rendererType;
        if (fileAssetLoader != null) {
            fileAssetLoader.setRendererType(getRendererType());
            fileAssetLoader.acquire();
            getDependencies().add(fileAssetLoader);
        }
        setCppPointer(m201import(bytes, bytes.length, getRendererType().getValue(), fileAssetLoader != null ? fileAssetLoader.getCppPointer() : 0L));
        getRefs().incrementAndGet();
        this.lock = new ReentrantLock();
    }

    public Artboard artboard(int i11) throws ArtboardException {
        long jCppArtboardByIndex = cppArtboardByIndex(getCppPointer(), i11);
        if (jCppArtboardByIndex != 0) {
            Artboard artboard = new Artboard(jCppArtboardByIndex, getLock());
            getDependencies().add(artboard);
            return artboard;
        }
        throw new ArtboardException(p.o("No Artboard found at index ", i11, '.'));
    }
}
