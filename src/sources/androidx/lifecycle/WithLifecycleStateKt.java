package androidx.lifecycle;

import qy.b0;
import rz.l;
import rz.m;
import rz.o0;
import rz.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class WithLifecycleStateKt {

    /* JADX INFO: renamed from: androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass2 implements fz.a {
        final /* synthetic */ fz.a $block;

        public AnonymousClass2(fz.a aVar) {
            this.$block = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
        @Override // fz.a
        public final R invoke() {
            return this.$block.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.lifecycle.LifecycleObserver, androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle lifecycle, final Lifecycle.State state, boolean z11, final y yVar, final fz.a aVar, vy.d<? super R> dVar) {
        final m mVar = new m(1, ue.f.x(dVar));
        mVar.s();
        final ?? r9 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                Object objL;
                kotlin.jvm.internal.m.f(source, "source");
                kotlin.jvm.internal.m.f(event, "event");
                if (event != Lifecycle.Event.Companion.upTo(state)) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.removeObserver(this);
                        mVar.resumeWith(com.bumptech.glide.e.l(new LifecycleDestroyedException()));
                        return;
                    }
                    return;
                }
                lifecycle.removeObserver(this);
                l lVar = mVar;
                try {
                    objL = aVar.invoke();
                } catch (Throwable th2) {
                    objL = com.bumptech.glide.e.l(th2);
                }
                lVar.resumeWith(objL);
            }
        };
        if (z11) {
            yVar.dispatch(vy.j.f54321a, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    lifecycle.addObserver(r9);
                }
            });
        } else {
            lifecycle.addObserver(r9);
        }
        mVar.u(new fz.c() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2
            @Override // fz.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return b0.f48488a;
            }

            public final void invoke(Throwable th2) {
                y yVar2 = yVar;
                vy.j jVar = vy.j.f54321a;
                if (!yVar2.isDispatchNeeded(jVar)) {
                    lifecycle.removeObserver(r9);
                    return;
                }
                y yVar3 = yVar;
                final Lifecycle lifecycle2 = lifecycle;
                final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = r9;
                yVar3.dispatch(jVar, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lifecycle2.removeObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                    }
                });
            }
        });
        Object objR = mVar.r();
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, fz.a aVar, vy.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        boolean zIsDispatchNeeded = cVar.isDispatchNeeded(dVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cVar, new AnonymousClass2(aVar), dVar);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, fz.a aVar, vy.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, fz.a aVar, vy.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        boolean zIsDispatchNeeded = cVar.isDispatchNeeded(dVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cVar, new AnonymousClass2(aVar), dVar);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, fz.a aVar, vy.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, fz.a aVar, vy.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        boolean zIsDispatchNeeded = cVar.isDispatchNeeded(dVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cVar, new AnonymousClass2(aVar), dVar);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, fz.a aVar, vy.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, fz.a aVar, vy.d<? super R> dVar) {
        if (state.compareTo(Lifecycle.State.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        boolean zIsDispatchNeeded = cVar.isDispatchNeeded(dVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cVar, new AnonymousClass2(aVar), dVar);
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, fz.a aVar, vy.d<? super R> dVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            yz.f fVar = o0.f50940a;
            sz.c cVar = wz.m.f55536a.f51961d;
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, fz.a aVar, vy.d<? super R> dVar) {
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        boolean zIsDispatchNeeded = cVar.isDispatchNeeded(dVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cVar, new AnonymousClass2(aVar), dVar);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, fz.a aVar, vy.d<? super R> dVar) {
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, fz.a aVar, vy.d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, fz.a aVar, vy.d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, fz.a aVar, vy.d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, fz.a aVar, vy.d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            yz.f fVar = o0.f50940a;
            sz.c cVar = wz.m.f55536a.f51961d;
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, fz.a aVar, vy.d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        boolean zIsDispatchNeeded = cVar.isDispatchNeeded(dVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cVar, new AnonymousClass2(aVar), dVar);
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, fz.a aVar, vy.d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        boolean zIsDispatchNeeded = cVar.isDispatchNeeded(dVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cVar, new AnonymousClass2(aVar), dVar);
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, fz.a aVar, vy.d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        boolean zIsDispatchNeeded = cVar.isDispatchNeeded(dVar.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cVar, new AnonymousClass2(aVar), dVar);
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, fz.a aVar, vy.d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            yz.f fVar = o0.f50940a;
            sz.c cVar = wz.m.f55536a.f51961d;
            boolean zIsDispatchNeeded = cVar.isDispatchNeeded(dVar.getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return aVar.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, cVar, new AnonymousClass2(aVar), dVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
