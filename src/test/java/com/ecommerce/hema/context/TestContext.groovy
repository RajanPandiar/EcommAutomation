package com.ecommerce.hema.context

class TestContext {

    private static InheritableThreadLocal<EcommContext> ecommContextThreadLocal = new InheritableThreadLocal<EcommContext>()

    static def init() {
        ecommContextThreadLocal.set(new EcommContext())

    }

    static def clear() {
        ecommContextThreadLocal.remove()

    }

    static EcommContext getEcommContext() {
        return ecommContextThreadLocal.get()
    }

}
