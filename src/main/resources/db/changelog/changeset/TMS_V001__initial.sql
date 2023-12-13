CREATE TABLE users (
    id bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    username varchar(128) NOT NULL UNIQUE,
    email varchar(128) NOT NULL UNIQUE,
    password varchar(128) NOT NULL,
    created_at timestamptz DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamptz DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE tasks (
    id bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    title varchar(128) NOT NULL,
    description varchar(4096),
    status smallint NOT NULL DEFAULT 0,
    priority smallint NOT NULL,
    author_id bigint NOT NULL,
    executor_id bigint NOT NULL,
    created_at timestamptz DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamptz DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_author_id FOREIGN KEY(author_id) REFERENCES users(id),
    CONSTRAINT fk_executor_id FOREIGN KEY(executor_id) REFERENCES users(id)
);

CREATE TABLE comments (
    id bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    content varchar(4096) NOT NULL,
    author_id bigint NOT NULL,
    task_id bigint NOT NULL,
    created_at timestamptz DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamptz DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_author_id FOREIGN KEY(author_id) REFERENCES users(id),
    CONSTRAINT fk_task_id FOREIGN KEY(task_id) REFERENCES tasks(id)
);