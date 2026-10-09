package le;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements e, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f39950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile i f39952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f39953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f39954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f39955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f39956g;

    public j(Object obj, e eVar) {
        d dVar = d.CLEARED;
        this.f39954e = dVar;
        this.f39955f = dVar;
        this.f39951b = obj;
        this.f39950a = eVar;
    }

    @Override // le.e, le.c
    public final boolean a() {
        boolean z11;
        synchronized (this.f39951b) {
            try {
                z11 = this.f39953d.a() || this.f39952c.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // le.c
    public final boolean b() {
        boolean z11;
        synchronized (this.f39951b) {
            z11 = this.f39954e == d.SUCCESS;
        }
        return z11;
    }

    @Override // le.e
    public final boolean c(c cVar) {
        boolean z11;
        synchronized (this.f39951b) {
            try {
                e eVar = this.f39950a;
                z11 = (eVar == null || eVar.c(this)) && cVar.equals(this.f39952c) && this.f39954e != d.PAUSED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // le.c
    public final void clear() {
        synchronized (this.f39951b) {
            this.f39956g = false;
            d dVar = d.CLEARED;
            this.f39954e = dVar;
            this.f39955f = dVar;
            this.f39953d.clear();
            this.f39952c.clear();
        }
    }

    @Override // le.e
    public final boolean d(c cVar) {
        boolean z11;
        synchronized (this.f39951b) {
            try {
                e eVar = this.f39950a;
                z11 = (eVar == null || eVar.d(this)) && cVar.equals(this.f39952c) && !a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // le.c
    public final void e() {
        synchronized (this.f39951b) {
            try {
                if (!this.f39955f.a()) {
                    this.f39955f = d.PAUSED;
                    this.f39953d.e();
                }
                if (!this.f39954e.a()) {
                    this.f39954e = d.PAUSED;
                    this.f39952c.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // le.e
    public final boolean f(c cVar) {
        boolean z11;
        synchronized (this.f39951b) {
            try {
                e eVar = this.f39950a;
                z11 = (eVar == null || eVar.f(this)) && (cVar.equals(this.f39952c) || this.f39954e != d.SUCCESS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // le.e
    public final void g(c cVar) {
        synchronized (this.f39951b) {
            try {
                if (!cVar.equals(this.f39952c)) {
                    this.f39955f = d.FAILED;
                    return;
                }
                this.f39954e = d.FAILED;
                e eVar = this.f39950a;
                if (eVar != null) {
                    eVar.g(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // le.e
    public final e getRoot() {
        e root;
        synchronized (this.f39951b) {
            try {
                e eVar = this.f39950a;
                root = eVar != null ? eVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // le.c
    public final boolean h() {
        boolean z11;
        synchronized (this.f39951b) {
            z11 = this.f39954e == d.CLEARED;
        }
        return z11;
    }

    @Override // le.e
    public final void i(c cVar) {
        synchronized (this.f39951b) {
            try {
                if (cVar.equals(this.f39953d)) {
                    this.f39955f = d.SUCCESS;
                    return;
                }
                this.f39954e = d.SUCCESS;
                e eVar = this.f39950a;
                if (eVar != null) {
                    eVar.i(this);
                }
                if (!this.f39955f.a()) {
                    this.f39953d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // le.c
    public final boolean isRunning() {
        boolean z11;
        synchronized (this.f39951b) {
            z11 = this.f39954e == d.RUNNING;
        }
        return z11;
    }

    @Override // le.c
    public final void j() {
        synchronized (this.f39951b) {
            try {
                this.f39956g = true;
                try {
                    if (this.f39954e != d.SUCCESS) {
                        d dVar = this.f39955f;
                        d dVar2 = d.RUNNING;
                        if (dVar != dVar2) {
                            this.f39955f = dVar2;
                            this.f39953d.j();
                        }
                    }
                    if (this.f39956g) {
                        d dVar3 = this.f39954e;
                        d dVar4 = d.RUNNING;
                        if (dVar3 != dVar4) {
                            this.f39954e = dVar4;
                            this.f39952c.j();
                        }
                    }
                    this.f39956g = false;
                } catch (Throwable th2) {
                    this.f39956g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // le.c
    public final boolean k(c cVar) {
        if (!(cVar instanceof j)) {
            return false;
        }
        j jVar = (j) cVar;
        if (this.f39952c == null) {
            if (jVar.f39952c != null) {
                return false;
            }
        } else if (!this.f39952c.k(jVar.f39952c)) {
            return false;
        }
        if (this.f39953d == null) {
            return jVar.f39953d == null;
        }
        return this.f39953d.k(jVar.f39953d);
    }
}
