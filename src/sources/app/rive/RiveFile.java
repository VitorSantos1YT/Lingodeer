package app.rive;

import app.rive.core.CommandQueue;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.ViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.h;
import rz.b0;
import rz.h0;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveFile {
    public static final int $stable = 0;
    private final h artboardNamesCache$delegate;
    private final CommandQueue commandQueue;
    private final h enumsCache$delegate;
    private final long fileHandle;
    private final Map<String, h> instanceNamesCache;
    private final b0 parentScope;
    private final Map<String, h> propertiesCache;
    private final h viewModelNamesCache$delegate;

    public /* synthetic */ RiveFile(long j11, CommandQueue commandQueue, b0 b0Var, f fVar) {
        this(j11, commandQueue, b0Var);
    }

    private final h0 getArtboardNamesCache() {
        return (h0) this.artboardNamesCache$delegate.getValue();
    }

    private final h0 getEnumsCache() {
        return (h0) this.enumsCache$delegate.getValue();
    }

    private final h0 getViewModelNamesCache() {
        return (h0) this.viewModelNamesCache$delegate.getValue();
    }

    public final Object getArtboardNames(d<? super List<String>> dVar) {
        return getArtboardNamesCache().await(dVar);
    }

    public final CommandQueue getCommandQueue$kotlin_release() {
        return this.commandQueue;
    }

    public final Object getEnums(d<? super List<File.Enum>> dVar) {
        return getEnumsCache().await(dVar);
    }

    /* JADX INFO: renamed from: getFileHandle-ENT3xMk$kotlin_release, reason: not valid java name */
    public final long m22getFileHandleENT3xMk$kotlin_release() {
        return this.fileHandle;
    }

    public final Object getViewModelInstanceNames(String str, d<? super List<String>> dVar) {
        h hVar;
        synchronized (this.instanceNamesCache) {
            try {
                Map<String, h> map = this.instanceNamesCache;
                h hVarLazyDeferred = map.get(str);
                if (hVarLazyDeferred == null) {
                    hVarLazyDeferred = RiveUIKt.lazyDeferred(this.parentScope, new RiveFile$getViewModelInstanceNames$2$1$1(this, str, null));
                    map.put(str, hVarLazyDeferred);
                }
                hVar = hVarLazyDeferred;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ((h0) hVar.getValue()).await(dVar);
    }

    public final Object getViewModelNames(d<? super List<String>> dVar) {
        return getViewModelNamesCache().await(dVar);
    }

    public final Object getViewModelProperties(String str, d<? super List<ViewModel.Property>> dVar) {
        h hVar;
        synchronized (this.propertiesCache) {
            try {
                Map<String, h> map = this.propertiesCache;
                h hVarLazyDeferred = map.get(str);
                if (hVarLazyDeferred == null) {
                    hVarLazyDeferred = RiveUIKt.lazyDeferred(this.parentScope, new RiveFile$getViewModelProperties$2$1$1(this, str, null));
                    map.put(str, hVarLazyDeferred);
                }
                hVar = hVarLazyDeferred;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ((h0) hVar.getValue()).await(dVar);
    }

    private RiveFile(long j11, CommandQueue commandQueue, b0 parentScope) {
        m.f(commandQueue, "commandQueue");
        m.f(parentScope, "parentScope");
        this.fileHandle = j11;
        this.commandQueue = commandQueue;
        this.parentScope = parentScope;
        this.artboardNamesCache$delegate = RiveUIKt.lazyDeferred(parentScope, new RiveFile$artboardNamesCache$2(this, null));
        this.viewModelNamesCache$delegate = RiveUIKt.lazyDeferred(parentScope, new RiveFile$viewModelNamesCache$2(this, null));
        this.instanceNamesCache = new LinkedHashMap();
        this.propertiesCache = new LinkedHashMap();
        this.enumsCache$delegate = RiveUIKt.lazyDeferred(parentScope, new RiveFile$enumsCache$2(this, null));
    }
}
