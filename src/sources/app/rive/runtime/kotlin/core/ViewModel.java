package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.ViewModelException;
import hh.p0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import nv.p;
import ry.n;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModel extends NativeObject {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Property {
        public static final int $stable = 0;
        private final String name;
        private final PropertyDataType type;

        public Property(PropertyDataType type, String name) {
            m.f(type, "type");
            m.f(name, "name");
            this.type = type;
            this.name = name;
        }

        public static /* synthetic */ Property copy$default(Property property, PropertyDataType propertyDataType, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                propertyDataType = property.type;
            }
            if ((i11 & 2) != 0) {
                str = property.name;
            }
            return property.copy(propertyDataType, str);
        }

        public final PropertyDataType component1() {
            return this.type;
        }

        public final String component2() {
            return this.name;
        }

        public final Property copy(PropertyDataType type, String name) {
            m.f(type, "type");
            m.f(name, "name");
            return new Property(type, name);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Property)) {
                return false;
            }
            Property property = (Property) obj;
            return this.type == property.type && m.a(this.name, property.name);
        }

        public final String getName() {
            return this.name;
        }

        public final PropertyDataType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Property(type=");
            sb2.append(this.type);
            sb2.append(", name=");
            return p0.o(sb2, this.name, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum PropertyDataType {
        NONE(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        COLOR(4),
        LIST(5),
        ENUM(6),
        TRIGGER(7),
        VIEW_MODEL(8),
        INTEGER(9),
        SYMBOL_LIST_INDEX(10),
        ASSET_IMAGE(11),
        ARTBOARD(12);

        private static final Map<Integer, PropertyDataType> map;
        private final int value;
        private static final /* synthetic */ yy.a $ENTRIES = ub.a.U(values());
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final PropertyDataType fromInt(int i11) {
                return (PropertyDataType) PropertyDataType.map.get(Integer.valueOf(i11));
            }

            private Companion() {
            }
        }

        PropertyDataType(int i11) {
            this.value = i11;
        }

        public static final PropertyDataType fromInt(int i11) {
            return Companion.fromInt(i11);
        }

        public static yy.a getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }

        static {
            yy.a entries = getEntries();
            int iW = x.W(n.W(entries, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iW < 16 ? 16 : iW);
            for (Object obj : entries) {
                linkedHashMap.put(Integer.valueOf(((PropertyDataType) obj).value), obj);
            }
            map = linkedHashMap;
        }
    }

    public ViewModel(long j11) {
        super(j11);
    }

    private final native long cppCreateBlankInstance(long j11);

    private final native long cppCreateDefaultInstance(long j11);

    private final native long cppCreateInstanceFromIndex(long j11, int i11);

    private final native long cppCreateInstanceFromName(long j11, String str);

    private final native List<Property> cppGetProperties(long j11);

    private final native int cppInstanceCount(long j11);

    private final native String cppName(long j11);

    private final native int cppPropertyCount(long j11);

    public final ViewModelInstance createBlankInstance() throws ViewModelException {
        long jCppCreateBlankInstance = cppCreateBlankInstance(getCppPointer());
        if (jCppCreateBlankInstance == 0) {
            throw new ViewModelException("Could not create a blank ViewModel instance");
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateBlankInstance);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public final ViewModelInstance createDefaultInstance() {
        long jCppCreateDefaultInstance = cppCreateDefaultInstance(getCppPointer());
        if (jCppCreateDefaultInstance == 0) {
            throw new ViewModelException("Could not create default ViewModel instance");
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateDefaultInstance);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public final ViewModelInstance createInstanceFromIndex(int i11) throws ViewModelException {
        long jCppCreateInstanceFromIndex = cppCreateInstanceFromIndex(getCppPointer(), i11);
        if (jCppCreateInstanceFromIndex == 0) {
            throw new ViewModelException(p.j(i11, "ViewModel instance not found: "));
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateInstanceFromIndex);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public final ViewModelInstance createInstanceFromName(String name) throws ViewModelException {
        m.f(name, "name");
        long jCppCreateInstanceFromName = cppCreateInstanceFromName(getCppPointer(), name);
        if (jCppCreateInstanceFromName == 0) {
            throw new ViewModelException("ViewModel instance not found: ".concat(name));
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateInstanceFromName);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public final int getInstanceCount() {
        return cppInstanceCount(getCppPointer());
    }

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final List<Property> getProperties() {
        return cppGetProperties(getCppPointer());
    }

    public final int getPropertyCount() {
        return cppPropertyCount(getCppPointer());
    }
}
