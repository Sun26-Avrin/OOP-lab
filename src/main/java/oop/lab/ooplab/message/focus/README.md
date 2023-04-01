## Quote
Chapter5. 책임과 메시지 of `객체지향의 사실과 오해` written by 조영호
- 객체에 보내는 메시지에는 수신 객체가 어떻게(How) 해야할지가 아닌, 
무엇(What)을 해야하는지에 초점이 맞춰져 있어야 수신 객체가 자율성을 가질 수 있다.


## Review
- 초기 **설계단계**(추상화단계)에서 메시지 송신자가 What 에 초점을 맞추어 설계를 하면 설계가 더 객체지향적으로 이루어질 수 있다. 
  - 또한 객체에 보내는 메시지를 How 에 맞춰서 작성하는 것이 무조건 틀린 것은 아니다. 다만 이는 설계시점이 아닌 **구체화**(구현)시점에 이루어져야 좋은 품질의 코드를 생산할 수 있다.
    - ```java 
      UserJpaRepostory.findByIdAndExpiredTimeGreaterThanDesc(Long id, LocalDatetime expireTime);
      ```
      - 해당 메시지는 How 에 초점이 맞춰져있다.
        - 하지만 이러한 How 에 초점이 맞춰진 메시지는 **구체화** 시점에 작성이 되며, 그의 뼈대인 `JpaRepository<T, ID>` 인터페이스와 그의 메시지(메서드)들은 설계시점에 작성이 되었다.
        - 하지만 `findAll(Sort sort)` 와 같은 메시지는 어느정도 How 에 초점이 맞춰져 있는 모습을 볼 수 있다.
          - ```java
            @NoRepositoryBean
            public interface JpaRepository<T, ID> extends PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T> {
                List<T> findAll();
          
                List<T> findAll(Sort var1);
          
                List<T> findAllById(Iterable<ID> var1);
          
                <S extends T> List<S> saveAll(Iterable<S> var1);
          
                void flush();
          
                <S extends T> S saveAndFlush(S var1);
          
                void deleteInBatch(Iterable<T> var1);
          
                void deleteAllInBatch();
          
                T getOne(ID var1);
          
                <S extends T> List<S> findAll(Example<S> var1);
          
                <S extends T> List<S> findAll(Example<S> var1, Sort var2);
            }
            ```
        - 그리고 `JpaRepository<T, ID>` 의 상위추상화인 `CrudRepository<T, ID>` 는 JPA 라는 문맥이 배제된 채 설계되었기 때문에 How 가 완전히 배제된 메시지를 가졌음을 관찰할 수 있다. 
          - ```java 
            @NoRepositoryBean
            public interface CrudRepository<T, ID> extends Repository<T, ID> {
              <S extends T> S save(S var1);
          
              <S extends T> Iterable<S> saveAll(Iterable<S> var1);
          
              Optional<T> findById(ID var1);
          
              boolean existsById(ID var1);
          
              Iterable<T> findAll();
          
              Iterable<T> findAllById(Iterable<ID> var1);
          
              long count();
          
              void deleteById(ID var1);
          
              void delete(T var1);
          
              void deleteAll(Iterable<? extends T> var1);
          
              void deleteAll();
            }
            ```

## Reference
- Chapter5. 책임과 메시지 of `객체지향의 사실과 오해` written by 조영호 