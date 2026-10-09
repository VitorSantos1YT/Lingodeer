package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import i0.pKy.shrCcjmOhAmRC;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f18159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f18160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f18161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Lazy f18162d;

    static {
        final int i11 = 3;
        f18159a = new Lazy(new Provider() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                switch (i11) {
                    case 0:
                        Lazy lazy = ExecutorsRegistrar.f18159a;
                        return new DelegatingScheduledExecutorService(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new CustomThreadFactory(shrCcjmOhAmRC.kloF, 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f18162d.get());
                    case 1:
                        Lazy lazy2 = ExecutorsRegistrar.f18159a;
                        return new DelegatingScheduledExecutorService(Executors.newCachedThreadPool(new CustomThreadFactory("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f18162d.get());
                    case 2:
                        Lazy lazy3 = ExecutorsRegistrar.f18159a;
                        return Executors.newSingleThreadScheduledExecutor(new CustomThreadFactory("Firebase Scheduler", 0, null));
                    default:
                        return ExecutorsRegistrar.a();
                }
            }
        });
        final int i12 = 0;
        f18160b = new Lazy(new Provider() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                switch (i12) {
                    case 0:
                        Lazy lazy = ExecutorsRegistrar.f18159a;
                        return new DelegatingScheduledExecutorService(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new CustomThreadFactory(shrCcjmOhAmRC.kloF, 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f18162d.get());
                    case 1:
                        Lazy lazy2 = ExecutorsRegistrar.f18159a;
                        return new DelegatingScheduledExecutorService(Executors.newCachedThreadPool(new CustomThreadFactory("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f18162d.get());
                    case 2:
                        Lazy lazy3 = ExecutorsRegistrar.f18159a;
                        return Executors.newSingleThreadScheduledExecutor(new CustomThreadFactory("Firebase Scheduler", 0, null));
                    default:
                        return ExecutorsRegistrar.a();
                }
            }
        });
        final int i13 = 1;
        f18161c = new Lazy(new Provider() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                switch (i13) {
                    case 0:
                        Lazy lazy = ExecutorsRegistrar.f18159a;
                        return new DelegatingScheduledExecutorService(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new CustomThreadFactory(shrCcjmOhAmRC.kloF, 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f18162d.get());
                    case 1:
                        Lazy lazy2 = ExecutorsRegistrar.f18159a;
                        return new DelegatingScheduledExecutorService(Executors.newCachedThreadPool(new CustomThreadFactory("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f18162d.get());
                    case 2:
                        Lazy lazy3 = ExecutorsRegistrar.f18159a;
                        return Executors.newSingleThreadScheduledExecutor(new CustomThreadFactory("Firebase Scheduler", 0, null));
                    default:
                        return ExecutorsRegistrar.a();
                }
            }
        });
        final int i14 = 2;
        f18162d = new Lazy(new Provider() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                switch (i14) {
                    case 0:
                        Lazy lazy = ExecutorsRegistrar.f18159a;
                        return new DelegatingScheduledExecutorService(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new CustomThreadFactory(shrCcjmOhAmRC.kloF, 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f18162d.get());
                    case 1:
                        Lazy lazy2 = ExecutorsRegistrar.f18159a;
                        return new DelegatingScheduledExecutorService(Executors.newCachedThreadPool(new CustomThreadFactory("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f18162d.get());
                    case 2:
                        Lazy lazy3 = ExecutorsRegistrar.f18159a;
                        return Executors.newSingleThreadScheduledExecutor(new CustomThreadFactory("Firebase Scheduler", 0, null));
                    default:
                        return ExecutorsRegistrar.a();
                }
            }
        });
    }

    public static ScheduledExecutorService a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i11 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i11 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new DelegatingScheduledExecutorService(Executors.newFixedThreadPool(4, new CustomThreadFactory("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) f18162d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Component.Builder builder = new Component.Builder(new Qualified(Background.class, ScheduledExecutorService.class), new Qualified[]{new Qualified(Background.class, ExecutorService.class), new Qualified(Background.class, Executor.class)});
        final int i11 = 0;
        builder.f18096f = new ComponentFactory() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.components.ComponentFactory
            public final Object d(ComponentContainer componentContainer) {
                switch (i11) {
                    case 0:
                        return (ScheduledExecutorService) ExecutorsRegistrar.f18159a.get();
                    case 1:
                        return (ScheduledExecutorService) ExecutorsRegistrar.f18161c.get();
                    case 2:
                        return (ScheduledExecutorService) ExecutorsRegistrar.f18160b.get();
                    default:
                        Lazy lazy = ExecutorsRegistrar.f18159a;
                        return UiExecutor.INSTANCE;
                }
            }
        };
        Component componentB = builder.b();
        Component.Builder builder2 = new Component.Builder(new Qualified(Blocking.class, ScheduledExecutorService.class), new Qualified[]{new Qualified(Blocking.class, ExecutorService.class), new Qualified(Blocking.class, Executor.class)});
        final int i12 = 1;
        builder2.f18096f = new ComponentFactory() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.components.ComponentFactory
            public final Object d(ComponentContainer componentContainer) {
                switch (i12) {
                    case 0:
                        return (ScheduledExecutorService) ExecutorsRegistrar.f18159a.get();
                    case 1:
                        return (ScheduledExecutorService) ExecutorsRegistrar.f18161c.get();
                    case 2:
                        return (ScheduledExecutorService) ExecutorsRegistrar.f18160b.get();
                    default:
                        Lazy lazy = ExecutorsRegistrar.f18159a;
                        return UiExecutor.INSTANCE;
                }
            }
        };
        Component componentB2 = builder2.b();
        Component.Builder builder3 = new Component.Builder(new Qualified(Lightweight.class, ScheduledExecutorService.class), new Qualified[]{new Qualified(Lightweight.class, ExecutorService.class), new Qualified(Lightweight.class, Executor.class)});
        final int i13 = 2;
        builder3.f18096f = new ComponentFactory() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.components.ComponentFactory
            public final Object d(ComponentContainer componentContainer) {
                switch (i13) {
                    case 0:
                        return (ScheduledExecutorService) ExecutorsRegistrar.f18159a.get();
                    case 1:
                        return (ScheduledExecutorService) ExecutorsRegistrar.f18161c.get();
                    case 2:
                        return (ScheduledExecutorService) ExecutorsRegistrar.f18160b.get();
                    default:
                        Lazy lazy = ExecutorsRegistrar.f18159a;
                        return UiExecutor.INSTANCE;
                }
            }
        };
        Component componentB3 = builder3.b();
        Component.Builder builderA = Component.a(new Qualified(UiThread.class, Executor.class));
        final int i14 = 3;
        builderA.f18096f = new ComponentFactory() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.components.ComponentFactory
            public final Object d(ComponentContainer componentContainer) {
                switch (i14) {
                    case 0:
                        return (ScheduledExecutorService) ExecutorsRegistrar.f18159a.get();
                    case 1:
                        return (ScheduledExecutorService) ExecutorsRegistrar.f18161c.get();
                    case 2:
                        return (ScheduledExecutorService) ExecutorsRegistrar.f18160b.get();
                    default:
                        Lazy lazy = ExecutorsRegistrar.f18159a;
                        return UiExecutor.INSTANCE;
                }
            }
        };
        return Arrays.asList(componentB, componentB2, componentB3, builderA.b());
    }
}
